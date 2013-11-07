/**
 * 
 */
package hu.dbsoftwares.ptoth;

import java.util.Stack;

/**
 * @author ptoth
 * @since 2013.11.07.
 * 
 * @web http://ptoth.github.io
 * @github http://github.com/ptoth
 * 
 */
public class Tower {
	public String name;
	public Stack<Object> stack = new Stack<Object>();

	public Tower(String name) {
		this.name = name;
	}

}
