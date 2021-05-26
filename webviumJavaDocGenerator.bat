@ECHO OFF
javadoc -d "d:\2021\wiki" -doctitle "PROJECT-WEBVIUM" -windowtitle "PROJECT-WEBVIUM Documentation" -footer "Copyright (c) 2021. Melvin Jones Repol" -keywords -sourcepath "d:\2021\com.mrepol742.webvium\app\src\main\java" -subpackages com
cd "d:\2021\wiki"
git add .
git commit -m "Inital commit"
git push origin master
PAUSE