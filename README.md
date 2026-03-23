<img src="https://cdn.pfps.gg/banners/6558-anime-gif.png" />

I’m constantly inspired by the fast-paced world of technology and love diving into new tools and frameworks that push the boundaries of what’s possible. Whether I’m learning something new or building creative solutions, I’m passionate about bringing fresh ideas to life and sharing what I discover with others. Let’s build something amazing together! 🚀

<!--START_SECTION:header-->
**I'm an Early 🐤** 

```text
🌞 Morning                3938 commits        ██████░░░░░░░░░░░░░░░░░░░   23.50 % 
🌆 Daytime                4789 commits        ███████░░░░░░░░░░░░░░░░░░   28.57 % 
🌃 Evening                5230 commits        ████████░░░░░░░░░░░░░░░░░   31.21 % 
🌙 Night                  2803 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.72 % 
```
📅 **I'm Most Productive on Wednesday** 

```text
Monday                   2233 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.32 % 
Tuesday                  2243 commits        ███░░░░░░░░░░░░░░░░░░░░░░   13.38 % 
Wednesday                2718 commits        ████░░░░░░░░░░░░░░░░░░░░░   16.22 % 
Thursday                 2414 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.40 % 
Friday                   2640 commits        ████░░░░░░░░░░░░░░░░░░░░░   15.75 % 
Saturday                 2446 commits        ████░░░░░░░░░░░░░░░░░░░░░   14.59 % 
Sunday                   2066 commits        ███░░░░░░░░░░░░░░░░░░░░░░   12.33 % 
```


📊 **This Week I Spent My Time On** 

```text
💬 Programming Languages: 
TypeScript               38 hrs 28 mins      ██████████████████░░░░░░░   72.26 % 
PHP                      3 hrs 7 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   05.88 % 
HTML                     2 hrs 48 mins       █░░░░░░░░░░░░░░░░░░░░░░░░   05.29 % 
CSS                      1 hr 32 mins        █░░░░░░░░░░░░░░░░░░░░░░░░   02.90 % 
JSON                     1 hr 9 mins         █░░░░░░░░░░░░░░░░░░░░░░░░   02.17 % 

🔥 Editors: 
Zed                      53 hrs 15 mins      █████████████████████████   100.00 % 

💻 Operating System: 
Linux                    53 hrs 15 mins      █████████████████████████   100.00 % 
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
Auto-nesting Proxy in JS: creates an infinitely deep 'default object' so you can write to deep paths without pre-initializing intermediate objects.
```js
// Auto-nesting object via Proxy
const Auto = (o = {}) => new Proxy(o, {
  get: (t, p) => (p in t) ? t[p] : (t[p] = Auto()),
  set: (t, p, v) => (t[p] = v, true),
});

const state = Auto();
state.user.profile.name = 'Ada';
state.config.theme.colors.primary = '#0bf';

console.log(state.user.profile.name);          // Ada
console.log(Boolean(state.config.theme));      // true
console.log(Object.keys(state.config.theme));  // [ 'colors' ]
```
```
### Challenge
JavaScript: Write a function reverseGraphemes(str) that reverses a string by user‑perceived characters (grapheme clusters) without breaking emojis or accents. Do not use external libraries. Research Intl.Segmenter and/or Unicode-aware regex to handle sequences like family emojis and combining marks. Test with '👨‍👩‍👧‍👦🇺🇳é' (man-woman-girl-boy + flag + 'e' + acute accent) and ensure the reversed string still has valid, intact grapheme clusters.
<!--END_SECTION:footer-->
- Submit a PR to [answer](https://github.com/mrepol742/challenge/fork).

### Updates

### Webvium Browser
The Fastest, The Lightest and The Tightest android web browser.

**Website:** [melvinjonesrepol.com/webvium-browser](https://melvinjonesrepol.com/webvium-browser)

---

### PROJECT DEEP
AI Driven blog spot about technology, businesses and related topics.

**website:* [projectdeep.vercel.app](https://projectdeep.vercel.app)

---

### DevPulse
Monitor your coding activity, create custom leaderboards, and compete with your team or the community.  
DevPulse brings WakaTime stats into a sleek, collaborative leaderboard experience.  

**Website:** [devpulse-waka.vercel.app](https://devpulse-waka.vercel.app)

---

### Floating Console Extension
A browser extension that provides a floating console for developers to easily access logs while browsing the web.  

**Website:** [melvinjonesrepol.com/floating-console-extension](https://melvinjonesrepol.com/floating-console-extension)

---

### Deploy Your Own Shortlink App
Get your link. Shorteeeeeen!  

**Website:** [go.melvinjonesrepol.com](https://go.melvinjonesrepol.com)

### Need help?
If you have an idea, let's make that idea come true!
From development, production to deployment. We can do that.

[Pricing](https://melvinjonesrepol.com/pricing) - [Contact me](https://melvinjonesrepol.com/contact-me)
