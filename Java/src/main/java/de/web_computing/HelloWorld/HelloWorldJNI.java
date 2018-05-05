package de.web_computing.HelloWorld;

public class HelloWorldJNI {
	private native void messageBox(String title, String message);

	public static void main(String[] args) {
		System.loadLibrary("lib/hello_world");

		HelloWorldJNI app = new HelloWorldJNI();
		app.messageBox("Title", "Hello World!");
	}
}
