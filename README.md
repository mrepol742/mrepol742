<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3920 commits        ██████░░░░░░░░░░░░░░░░░░░   23.48 % 
🌆 Daytime                4774 commits        ███████░░░░░░░░░░░░░░░░░░   28.59 % 
🌃 Evening                5203 commits        ████████░░░░░░░░░░░░░░░░░   31.16 % 
🌙 Night                  2800 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.77 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2221 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.30 % 
Tuesday                  2227 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.34 % 
Wednesday                2706 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.21 % 
Thursday                 2410 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.43 % 
Friday                   2640 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.81 % 
Saturday                 2437 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.60 % 
Sunday                   2056 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.31 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               37 hrs 7 mins       █████████████████░░░░░░░░   69.56 % 
PHP                      6 hrs 2 mins        ███░░░░░░░░░░░░░░░░░░░░░░   11.33 % 
HTML                     3 hrs 10 mins       █░░░░░░░░░░░░░░░░░░░░░░░░   05.94 % 
GraphQL                  1 hr 34 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   02.95 % 
CSS                      1 hr 14 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   02.33 % 

🔥 Editors: 
Zed                      53 hrs 22 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    53 hrs 22 mins      █████████████████████████   100.00 % 
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
// TypeScript brand trick: attach phantom types to numbers to enforce units at compile time.
// Prevents mixing meters and seconds, with zero runtime cost.

type Brand<T, B extends string> = T & { readonly __brand: B };

type Meters = Brand<number, 'Meters'>;
type Seconds = Brand<number, 'Seconds'>;
type MetersPerSecond = Brand<number, 'MetersPerSecond'>;

const meters = (n: number) => n as Meters;
const seconds = (n: number) => n as Seconds;

const speed = (distance: Meters, time: Seconds): MetersPerSecond =>
  (distance / time) as MetersPerSecond;

// Usage
const d = meters(100);
const t = seconds(9.58);
const v = speed(d, t); // ok, v is MetersPerSecond

// Uncomment to see compile-time errors:
// const bad = speed(seconds(100), meters(9.58)); // Type error: argument types do not match
// const alsoBad: Seconds = meters(5); // Type error: cannot assign Meters to Seconds
```
### Challenge
In Python: Write a function get_capital(country: str) -> str that queries a public REST API to return the capital of the given country. Constraints: use only the standard library for HTTP, handle timeouts and 4xx/5xx responses, disambiguate tricky names (e.g., Congo), and include a brief docstring describing the API you chose.
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
