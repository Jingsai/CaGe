/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class lisken_systoolbox_BufferedFDOutputStream */

#ifndef _Included_lisken_systoolbox_BufferedFDOutputStream
#define _Included_lisken_systoolbox_BufferedFDOutputStream
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     lisken_systoolbox_BufferedFDOutputStream
 * Method:    init
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_lisken_systoolbox_BufferedFDOutputStream_init
  (JNIEnv *, jobject, jint);

/*
 * Class:     lisken_systoolbox_BufferedFDOutputStream
 * Method:    openFile
 * Signature: ([BZ)J
 */
JNIEXPORT jlong JNICALL Java_lisken_systoolbox_BufferedFDOutputStream_openFile
  (JNIEnv *, jobject, jbyteArray, jboolean);

/*
 * Class:     lisken_systoolbox_BufferedFDOutputStream
 * Method:    nWrite
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_lisken_systoolbox_BufferedFDOutputStream_nWrite
  (JNIEnv *, jobject, jlong, jint);

/*
 * Class:     lisken_systoolbox_BufferedFDOutputStream
 * Method:    nFlush
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_lisken_systoolbox_BufferedFDOutputStream_nFlush
  (JNIEnv *, jobject, jlong);

/*
 * Class:     lisken_systoolbox_BufferedFDOutputStream
 * Method:    nClose
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_lisken_systoolbox_BufferedFDOutputStream_nClose
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
