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

public class NBTTagEnd extends NBTTagBase<Object> {

	protected NBTTagEnd() {
	}

	@Override
	public NBTTagType getType() {
		return NBTTagType.END;
	}

	@Override
	public NBTTagEnd writeValue(DataOutputStream stream) {
		return this;
	}

	@Override
	public NBTTagEnd readValue(DataInputStream stream) {
		return this;
	}

	@Override
	public Object getValue() {
		return null;
	}

	@Override
	public void setValue(Object value) {
	}

	@Override
	public Object toJava() {
		return null;
	}

}
