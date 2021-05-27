@ECHO OFF
javadoc -d "d:\2021\wiki" -doctitle "PROJECT-WEBVIUM" -windowtitle "PROJECT-WEBVIUM Documentation" -footer "<a href="https://mrepol742.github.io">Copyright (c) 2021. Melvin Jones Repol</a>" -keywords -sourcepath "d:\2021\com.mrepol742.webvium\app\src\main\java" -stylesheetfile "d:\2021\mrepol742\stylesheet.css" -top "Download PROJECT-WEBVIUM <a href="https://mrepol742.github.io/PROJECT-WEBVIUM">https://mrepol742.github.io/PROJECT-WEBVIUM</a>" -bottom "PROJECT-WEBVIUM was Programmed by <a href="https://mrepol742.github.io">mrepol742</a> with assistance of <a href="SamiunNafis.github.io">SamiunNafis</a>" -header "PROJECT-WEBVIUM" -notimestamp -subpackages com
cd "d:\2021\wiki"
git add .
git commit -m "Inital commit"
git push origin master
PAUSE