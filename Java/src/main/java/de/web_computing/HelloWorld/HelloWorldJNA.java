package de.web_computing.HelloWorld;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class HelloWorldJNA {
	private interface User32 extends Library {
		User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);
		int MessageBoxA(int hwnd, String message, String title, int flags);
	}

	public static void main(String[] args) {
		User32.INSTANCE.MessageBoxA(0, "Hello World!", "Title", 0);
	}

}
