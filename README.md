![](https://github.com/0x3EF8/0x3EF8/raw/main/images/header_.png)

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
![Lines of code](https://img.shields.io/badge/From%20Hello%20World%20I%27ve%20Written-23.0%20million%20lines%20of%20code-blue)

**I'm an Early 🐤** 

```text
🌞 Morning                7005 commits        █████░░░░░░░░░░░░░░░░░░░░   21.92 % 
🌆 Daytime                9914 commits        ████████░░░░░░░░░░░░░░░░░   31.02 % 
🌃 Evening                9793 commits        ████████░░░░░░░░░░░░░░░░░   30.64 % 
🌙 Night                  5250 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.43 % 
```
📅 **I'm Most Productive on Friday** 

```text
Monday                   4595 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.38 % 
Tuesday                  4112 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.87 % 
Wednesday                4938 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.45 % 
Thursday                 4269 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.36 % 
Friday                   5329 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.67 % 
Saturday                 4930 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.42 % 
Sunday                   3789 commits        ███░░░░░░░░░░░░░░░░░░░░░░   11.85 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               34 hrs 9 mins       ████████████████████░░░░░   81.83 % 
JavaScript               1 hr 16 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   03.04 % 
Other                    1 hr 8 mins         █░░░░░░░░░░░░░░░░░░░░░░░░   02.75 % 
YAML                     1 hr                █░░░░░░░░░░░░░░░░░░░░░░░░   02.43 % 
HTML                     34 mins             ░░░░░░░░░░░░░░░░░░░░░░░░░   01.38 % 

🔥 Editors: 
VS Code                  41 hrs 43 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    41 hrs 43 mins      █████████████████████████   100.00 % 
```

**I Mostly Code in JavaScript** 

```text
JavaScript               51 repos            ████████░░░░░░░░░░░░░░░░░   30.72 % 
Java                     31 repos            █████░░░░░░░░░░░░░░░░░░░░   18.67 % 
PHP                      20 repos            ███░░░░░░░░░░░░░░░░░░░░░░   12.05 % 
TypeScript               15 repos            ██░░░░░░░░░░░░░░░░░░░░░░░   09.04 % 
Python                   4 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.41 % 
```




<!--END_SECTION:header-->

<!--START_SECTION:footer-->
### Code Snippet
```js
// Reverses a string in JavaScript using bitwise XOR swapping (no temporary variables, no built-ins)
function quirkyReverse(s) {
  let arr = s.split('');
  for (let i = 0, j = arr.length - 1; i < j; i++, j--) {
    // XOR swap: arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j]; doesn't work with strings, but you can with char codes
    arr[i] = String.fromCharCode(arr[i].charCodeAt() ^ arr[j].charCodeAt());
    arr[j] = String.fromCharCode(arr[i].charCodeAt() ^ arr[j].charCodeAt());
    arr[i] = String.fromCharCode(arr[i].charCodeAt() ^ arr[j].charCodeAt());
  }
  return arr.join('');
}
// quirkyReverse('hello') => 'olleh'
```
### Challenge
Python Challenge: Write a function that returns the Wikipedia summary for any given search term. You may only use the requests library (no Wikipedia-specific packages), and you must handle disambiguation pages gracefully.
<!--END_SECTION:footer-->
> Submit a PR to [Challenge](https://github.com/mrepol742/challenge/fork).
