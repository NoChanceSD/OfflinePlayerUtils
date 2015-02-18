/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package offlineplayerutils.simplenbt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class NBTTagNumber<T extends Number> extends NBTTagBase<T> {

	private NBTTagType type;
	protected NBTTagNumber(NBTTagType type) {
		this.type = type;
	}

	private T number;

	@Override
	public NBTTagType getType() {
		return type;
	}

	@Override
	public T getValue() {
		return number;
	}

	@Override
	public void setValue(T value) {
		number = value;
	}

	@Override
	public NBTTagNumber<T> writeValue(DataOutputStream stream) throws IOException {
		switch (getType()) {
			case BYTE: {
				stream.writeByte(number.byteValue());
				break;
			}
			case SHORT: {
				stream.writeShort(number.shortValue());
				break;
			}
			case INT: {
				stream.writeInt(number.intValue());
				break;
			}
			case LONG: {
				stream.writeLong(number.longValue());
				break;
			}
			case FLOAT: {
				stream.writeFloat(number.floatValue());
				break;
			}
			case DOUBLE: {
				stream.writeDouble(number.doubleValue());
				break;
			}
			default: {
				throw new UnsupportedOperationException("Number type "+number.getClass().getSimpleName()+" is not supported");
			}
		}
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NBTTagNumber<T> readValue(DataInputStream stream) throws IOException {
		switch (getType()) {
			case BYTE: {
				number = (T) new Byte(stream.readByte());
				break;
			}
			case SHORT: {
				number = (T) new Short(stream.readShort());
				break;
			}
			case INT: {
				number = (T) new Integer(stream.readInt());
				break;
			}
			case LONG: {
				number = (T) new Long(stream.readLong());
				break;
			}
			case FLOAT: {
				number = (T) new Float(stream.readFloat());
				break;
			}
			case DOUBLE: {
				number = (T) new Double(stream.readDouble());
				break;
			}
			default: {
				throw new UnsupportedOperationException("Number type "+number.getClass().getSimpleName()+" is not supported");
			}
		}
		return this;
	}

}