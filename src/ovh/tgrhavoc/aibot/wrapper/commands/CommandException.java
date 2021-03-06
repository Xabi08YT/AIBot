/*******************************************************************************
 *     Copyright (C) 2015 Jordan Dalton (jordan.8474@gmail.com)
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *******************************************************************************/
package ovh.tgrhavoc.aibot.wrapper.commands;

@SuppressWarnings("serial")
public class CommandException extends Exception {
	private final Command command;

	public CommandException() {
		command = null;
	}

	public CommandException(String message) {
		super(message);
		command = null;
	}

	public CommandException(Throwable cause) {
		super(cause);
		command = null;
	}

	public CommandException(String message, Throwable cause) {
		super(message, cause);
		command = null;
	}

	public CommandException(Command command) {
		this.command = command;
	}

	public CommandException(Command command, String message) {
		super(message);
		this.command = command;
	}

	public CommandException(Command command, Throwable cause) {
		super(cause);
		this.command = command;
	}

	public CommandException(Command command, String message, Throwable cause) {
		super(message, cause);
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}
}
