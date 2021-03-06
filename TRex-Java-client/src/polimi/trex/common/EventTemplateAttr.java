//
// This file is part of T-Rex, a Complex Event Processing Middleware.
// See http://home.dei.polimi.it/margara
//
// Authors: Alessandro Margara
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this program.  If not, see http://www.gnu.org/licenses/.
//

package polimi.trex.common;

/**
 * Specifies a single attribute in an EventTemplate 
 */
public class EventTemplateAttr {
	private String name;
	private OpTree value;
	
	public EventTemplateAttr(String name, OpTree value) {
		this.name = name;
		this.value = value;
	}
	
	public void setOpTree(OpTree tree) {
		this.value = tree;
	}

	public String getName() {
		return name;
	}

	public OpTree getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (! (obj instanceof EventTemplateAttr)) return false;
		EventTemplateAttr other = (EventTemplateAttr) obj;
		if (! name.equals(other.name)) return false;
		if (! value.equals(other.value)) return false;
		return true;
	}
}
