<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3692 commits        ██████░░░░░░░░░░░░░░░░░░░   23.34 % 
🌆 Daytime                4562 commits        ███████░░░░░░░░░░░░░░░░░░   28.84 % 
🌃 Evening                4940 commits        ████████░░░░░░░░░░░░░░░░░   31.23 % 
🌙 Night                  2623 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.58 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2131 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.47 % 
Tuesday                  2099 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.27 % 
Wednesday                2560 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.19 % 
Thursday                 2269 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.35 % 
Friday                   2489 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.74 % 
Saturday                 2315 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.64 % 
Sunday                   1954 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.35 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               15 hrs 59 mins      ███████████████░░░░░░░░░░   60.15 % 
PHP                      5 hrs 56 mins       ██████░░░░░░░░░░░░░░░░░░░   22.31 % 
GraphQL                  50 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   03.15 % 
Svelte                   42 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.66 % 
JavaScript               40 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.56 % 

🔥 Editors: 
Zed                      26 hrs 35 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    26 hrs 35 mins      █████████████████████████   100.00 % 
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
