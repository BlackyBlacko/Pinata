/*
 * Pinata plugin - spawn pinata mob and kill it to get drops
 * Copyright (C)2018 Plajer
 *
 *  This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package pl.plajer.pinata.commands;

import org.bukkit.command.CommandSender;

/**
 * @author Plajer
 * <p>
 * Created at 31.10.2018
 */
public class CommandArgument {

  private String argumentName;
  private String permission;
  private ExecutorType validExecutors;

  public CommandArgument(String argumentName, String permission, ExecutorType validExecutors) {
    this.argumentName = argumentName;
    this.permission = permission;
    this.validExecutors = validExecutors;
  }

  public String getArgumentName() {
    return argumentName;
  }

  public String getPermission() {
    return permission;
  }

  public ExecutorType getValidExecutors() {
    return validExecutors;
  }

  public void execute(CommandSender sender, String[] args) {}

  public enum ExecutorType {
    BOTH, CONSOLE, PLAYER
  }

}
