// lib.cpp: Definiert die exportierten Funktionen für die DLL-Anwendung.
//

#include "stdafx.h"
#include "de_web_computing_HelloWorld_HelloWorldJNI.h"

JNIEXPORT void JNICALL Java_de_web_1computing_HelloWorld_HelloWorldJNI_messageBox
(JNIEnv* env, jobject cls, jstring jTitle, jstring jMessage) {
	const char* title = env->GetStringUTFChars(jTitle, 0);
	const char* msg = env->GetStringUTFChars(jMessage, 0);

	MessageBoxA(HWND_DESKTOP, msg, title, MB_OK);
}