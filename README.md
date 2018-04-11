# bsdiff

Step 1.
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.ZHANGxp123:bsdiff:v1.0.0'
	}
  
  
方法调用：
BsDiff.bsdiff(oldPath, newPath, diffPath);
oldPath:旧的apk文件放置的路径
newPath：新的apk文件放置的路径
diffPath:要生成的patch文件放置的路径
