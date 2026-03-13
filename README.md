<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3903 commits        ██████░░░░░░░░░░░░░░░░░░░   23.41 % 
🌆 Daytime                4768 commits        ███████░░░░░░░░░░░░░░░░░░   28.60 % 
🌃 Evening                5203 commits        ████████░░░░░░░░░░░░░░░░░   31.20 % 
🌙 Night                  2800 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.79 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2222 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.33 % 
Tuesday                  2216 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.29 % 
Wednesday                2700 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.19 % 
Thursday                 2412 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.47 % 
Friday                   2635 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.80 % 
Saturday                 2435 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.60 % 
Sunday                   2054 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.32 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               15 hrs 47 mins      ██████████████░░░░░░░░░░░   54.77 % 
PHP                      5 hrs 26 mins       █████░░░░░░░░░░░░░░░░░░░░   18.87 % 
Kotlin                   2 hrs 22 mins       ██░░░░░░░░░░░░░░░░░░░░░░░   08.24 % 
Blade Template           46 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.70 % 
JSON                     43 mins             █░░░░░░░░░░░░░░░░░░░░░░░░   02.52 % 

🔥 Editors: 
Zed                      25 hrs 45 mins      ██████████████████████░░░   89.31 % 
Android Studio           3 hrs 4 mins        ███░░░░░░░░░░░░░░░░░░░░░░   10.69 % 

💻 Operating System: 
Linux                    28 hrs 50 mins      █████████████████████████   100.00 % 
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
