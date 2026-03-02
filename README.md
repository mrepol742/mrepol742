<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3835 commits        ██████░░░░░░░░░░░░░░░░░░░   23.45 % 
🌆 Daytime                4727 commits        ███████░░░░░░░░░░░░░░░░░░   28.91 % 
🌃 Evening                5094 commits        ████████░░░░░░░░░░░░░░░░░   31.15 % 
🌙 Night                  2697 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.49 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2173 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.29 % 
Tuesday                  2175 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.30 % 
Wednesday                2669 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.32 % 
Thursday                 2335 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.28 % 
Friday                   2568 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.70 % 
Saturday                 2403 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.69 % 
Sunday                   2030 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.41 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               9 hrs 27 mins       ████████░░░░░░░░░░░░░░░░░   33.11 % 
PHP                      8 hrs 18 mins       ███████░░░░░░░░░░░░░░░░░░   29.10 % 
GraphQL                  2 hrs 47 mins       ██░░░░░░░░░░░░░░░░░░░░░░░   09.77 % 
JavaScript               2 hrs 32 mins       ██░░░░░░░░░░░░░░░░░░░░░░░   08.89 % 
Java                     1 hr 28 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   05.14 % 

🔥 Editors: 
Zed                      26 hrs 27 mins      ███████████████████████░░   92.62 % 
Android Studio           2 hrs 6 mins        ██░░░░░░░░░░░░░░░░░░░░░░░   07.38 % 

💻 Operating System: 
Linux                    28 hrs 34 mins      █████████████████████████   100.00 % 
```

**I Mostly Code in JavaScript** 

```text
JavaScript               32 repos            ██████░░░░░░░░░░░░░░░░░░░   22.07 % 
TypeScript               20 repos            ███░░░░░░░░░░░░░░░░░░░░░░   13.79 % 
HTML                     16 repos            ███░░░░░░░░░░░░░░░░░░░░░░   11.03 % 
Rust                     3 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.07 % 
Kotlin                   3 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.07 % 
```




<!--END_SECTION:header-->

<!--START_SECTION:footer-->
### Code Snippet
```js
// One-line synchronous 'sleep' in Node.js using Atomics.wait.
// It blocks the event loop—use only for demos or scripts where blocking is acceptable.

```js
const sleep = ms => Atomics.wait(new Int32Array(new SharedArrayBuffer(4)), 0, 0, ms);

console.time('blocked');
console.log('Before');
sleep(750); // blocks ~750ms
console.log('After');
console.timeEnd('blocked');
```

// Bonus: a non-blocking version for comparison
```js
const sleepAsync = ms => new Promise(r => setTimeout(r, ms));
(async () => {
  console.time('async');
  console.log('Before');
  await sleepAsync(750);
  console.log('After');
  console.timeEnd('async');
})();
```
```
### Challenge
JavaScript: Implement parseDuration(str) that converts human-readable durations like '2d 4h 30m 15s 120ms' or '1.5h' into total milliseconds without using libraries; support d, h, m, s, ms, handle mixed order and decimals, validate input and explain assumptions.
<!--END_SECTION:footer-->
- Submit a PR to [answer](https://github.com/mrepol742/challenge/fork).
