# Written by Olivier Goutay

# For development only, get rid of this options for real releases
#-dontobfuscate
#-dontoptimize


-target 1.7
-optimizationpasses 3
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-dontshrink
-verbose

-dontwarn android.support.**

# The -optimizations option disables some arithmetic simplifications that Dalvik 1.0 and 1.5 can't handle.
-optimizations !code/simplification/arithmetic


# TO KEEP ANNOTATION
-keepattributes SourceFile,LineNumberTable,*Annotation*,Signature
-keep class javax.annotation.** { *; }
-keepattributes *Annotation*
# END ANNOTATION


# TO KEEP CRUCIAL CLASSES AND FUNCTIONS FOR ANDROID SYSTEM
-keep public class * extends android.app.Activity
-keep public class * extends android.widget.RelativeLayout
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep class com.google.inject.Binder

-keepclassmembers class * {
	void finalizeReferent();
}

-keepclassmembers class * {
	<init>(...);
}

-keepclassmembers class * {
    void *(**On*Event);
}

-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}

-keepclasseswithmembernames class * {
    native <methods>;
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

-keepclassmembers class * implements android.os.Parcelable {
    static android.os.Parcelable$Creator CREATOR;
}

-keepclassmembers class **.R$* {
    public static <fields>;
}
# END ANDROID