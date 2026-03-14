<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3905 commits        ██████░░░░░░░░░░░░░░░░░░░   23.41 % 
🌆 Daytime                4772 commits        ███████░░░░░░░░░░░░░░░░░░   28.60 % 
🌃 Evening                5205 commits        ████████░░░░░░░░░░░░░░░░░   31.20 % 
🌙 Night                  2802 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.79 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2222 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.32 % 
Tuesday                  2216 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.28 % 
Wednesday                2700 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.18 % 
Thursday                 2412 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.46 % 
Friday                   2643 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.84 % 
Saturday                 2437 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.61 % 
Sunday                   2054 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.31 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               13 hrs 48 mins      ████████████░░░░░░░░░░░░░   48.24 % 
PHP                      6 hrs 18 mins       ██████░░░░░░░░░░░░░░░░░░░   22.03 % 
Kotlin                   2 hrs 22 mins       ██░░░░░░░░░░░░░░░░░░░░░░░   08.31 % 
JavaScript               55 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   03.21 % 
JSON                     53 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   03.11 % 

🔥 Editors: 
Zed                      25 hrs 32 mins      ██████████████████████░░░   89.23 % 
Android Studio           3 hrs 4 mins        ███░░░░░░░░░░░░░░░░░░░░░░   10.77 % 

💻 Operating System: 
Linux                    28 hrs 37 mins      █████████████████████████   100.00 % 
```

**I Mostly Code in JavaScript** 

```text
JavaScript               32 repos            █████░░░░░░░░░░░░░░░░░░░░   21.92 % 
TypeScript               20 repos            ███░░░░░░░░░░░░░░░░░░░░░░   13.70 % 
HTML                     17 repos            ███░░░░░░░░░░░░░░░░░░░░░░   11.64 % 
Python                   4 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.74 % 
Rust                     3 repos             █░░░░░░░░░░░░░░░░░░░░░░░░   02.05 % 
```




<!--END_SECTION:header-->

<!--START_SECTION:footer-->
### Code Snippet
```js
// Throw-on-missing options using default parameter initializers and object destructuring.
// This fails fast with a clear error for required fields, while keeping optional defaults tidy.
const required = name => { throw new Error(`Missing required option: ${name}`); };

function connect({
  host = required('host'),
  port = 5432,
  secure = false,
  timeoutMs = 3000
} = {}) {
  return `${secure ? 'wss' : 'ws'}://${host}:${port}?t=${timeoutMs}`;
}

// Usage:
console.log(connect({ host: 'example.com', secure: true })); // wss://example.com:5432?t=3000
// connect(); // throws Error: Missing required option: host
```
### Challenge
Write a function nth_weekday(year, month, weekday, n) that returns the ISO date (YYYY-MM-DD) for the nth occurrence of the weekday in that month (e.g., the 2nd Tuesday of March 2025), or None if it doesn't exist, without using external libraries (only datetime) in Python.
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

**Website:** https://melvinjonesrepol.com/floating-console-extension

---

### Deploy Your Own Shortlink App
Get your link. Shorteeeeeen!  

**Website:** https://go.melvinjonesrepol.com/

### Need help?
If you have an idea, let's make that idea come true!
From development, production to deployment. We can do that.

[Pricing](https://melvinjonesrepol.com/pricing) - [Contact me](https://melvinjonesrepol.com/contact-me)
