<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3285 commits        ██████░░░░░░░░░░░░░░░░░░░   22.81 % 
🌆 Daytime                4142 commits        ███████░░░░░░░░░░░░░░░░░░   28.76 % 
🌃 Evening                4430 commits        ████████░░░░░░░░░░░░░░░░░   30.76 % 
🌙 Night                  2545 commits        ████░░░░░░░░░░░░░░░░░░░░░   17.67 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   1849 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.84 % 
Tuesday                  1839 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.77 % 
Wednesday                2432 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.89 % 
Thursday                 2033 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.12 % 
Friday                   2341 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.25 % 
Saturday                 2134 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.82 % 
Sunday                   1774 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.32 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               22 hrs 2 mins       ██████████████░░░░░░░░░░░   57.76 % 
PHP                      8 hrs 7 mins        █████░░░░░░░░░░░░░░░░░░░░   21.28 % 
JSON                     1 hr 31 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   03.98 % 
GraphQL                  1 hr 22 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   03.60 % 
HTML                     1 hr 14 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   03.24 % 

🔥 Editors: 
Zed                      38 hrs 10 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    38 hrs 10 mins      █████████████████████████   100.00 % 
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
/*
Turns any async function into a 'once' function: concurrent calls share one in-flight Promise; failures reset the memoization. Great for deduplicating config fetches or database warm-ups.
*/
function onceAsync(fn) {
  let p = null;
  return (...args) => {
    if (!p) {
      p = Promise.resolve().then(() => fn(...args)).catch(err => {
        p = null; // reset on error so next call can retry
        throw err;
      });
    }
    return p;
  };
}

// Example: only one network request despite multiple callers
const getConfig = onceAsync(async () => {
  const res = await fetch('/config.json');
  return res.json();
});

Promise.all([getConfig(), getConfig(), getConfig()])
  .then(([a, b, c]) => console.log(a === b && b === c)); // true
```
### Challenge
Python: Write a function that determines whether an input IP string is in a private/internal range for both IPv4 and IPv6 without using external libraries. Research RFC1918 and RFC4193, handle IPv6 shorthand (::), and support CIDR notation ranges like 10.0.0.0/8 and fc00::/7.
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
