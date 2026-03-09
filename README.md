<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3836 commits        ██████░░░░░░░░░░░░░░░░░░░   23.40 % 
🌆 Daytime                4734 commits        ███████░░░░░░░░░░░░░░░░░░   28.88 % 
🌃 Evening                5105 commits        ████████░░░░░░░░░░░░░░░░░   31.14 % 
🌙 Night                  2718 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.58 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2178 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.29 % 
Tuesday                  2179 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.29 % 
Wednesday                2669 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.28 % 
Thursday                 2350 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.34 % 
Friday                   2576 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.71 % 
Saturday                 2409 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.70 % 
Sunday                   2032 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.40 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               15 hrs 27 mins      ████████████████░░░░░░░░░   64.40 % 
PHP                      4 hrs 34 mins       █████░░░░░░░░░░░░░░░░░░░░   19.03 % 
Svelte                   42 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.94 % 
JavaScript               40 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.84 % 
GraphQL                  36 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.53 % 

🔥 Editors: 
Zed                      23 hrs 59 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    23 hrs 59 mins      █████████████████████████   100.00 % 
```

**I Mostly Code in JavaScript** 

```text
JavaScript               32 repos            █████░░░░░░░░░░░░░░░░░░░░   21.92 % 
TypeScript               20 repos            ███░░░░░░░░░░░░░░░░░░░░░░   13.70 % 
HTML                     17 repos            ███░░░░░░░░░░░░░░░░░░░░░░   11.64 % 
Rust                     3 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.05 % 
Kotlin                   3 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.05 % 
```




<!--END_SECTION:header-->

<!--START_SECTION:footer-->
### Code Snippet
```js
// This JavaScript Proxy lets you "build" a property path by simply accessing properties.
// When coerced to a string (via String(), template literals, or + ''), it returns the dot-separated path.
// Handy for logging, dynamic selectors, or tiny DSL-like APIs.

const Path = (parts = []) => new Proxy(Object.create(null), {
  get(_target, prop) {
    if (prop === 'toString' || prop === 'valueOf' || prop === Symbol.toPrimitive) {
      return () => parts.join('.');
    }
    return Path(parts.concat(String(prop)));
  }
});

const path = Path();
console.log(`${path.api.v1.users[0].name.first}`); // "api.v1.users.0.name"
console.log(String(path.config.database['connection-string'])); // "config.database.connection-string"
```
### Challenge
Write a function in JavaScript that implements a natural sort comparator for strings (e.g., 'file2' before 'file10') without using Intl.Collator or localeCompare({ numeric: true }). Consider negative numbers, multiple numeric segments, and case-insensitive sorting.
<!--END_SECTION:footer-->
- Submit a PR to [answer](https://github.com/mrepol742/challenge/fork).

### Updates

### DevPulse
Monitor your coding activity, create custom leaderboards, and compete with your team or the community.  
DevPulse brings WakaTime stats into a sleek, collaborative leaderboard experience.  

**Website:** https://devpulse-waka.vercel.app/

---

### Floating Console Extension
A browser extension that provides a floating console for developers to easily access logs while browsing the web.  

**Website:** http://melvinjonesrepol.com/floating-console-extension

---

### Deploy Your Own Shortlink App
Get your link. Shorteeeeeen!  

**Website:** https://go.melvinjonesrepol.com/
