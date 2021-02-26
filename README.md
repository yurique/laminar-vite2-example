# laminar-snowpack-example

An example of a [Vite](https://vitejs.dev/) build for a [Scala.js](https://scala-js.org) + [Laminar](https://github.com/raquo/Laminar) +
[frontroute](https://github.com/tulz-app/frontroute) app.

## embedded-files

This app also demonstrates how to use the [embedded-files](https://github.com/yurique/embedded-files/) – sbt plugin and
the macro – to effectively achieve "resources" in Scala.js.

## tailwindcss

The app is styled with [tailwindcss](https://tailwindcss.com/).

## installing npm dependencies

```console
$ cd modules/website
$ yarn install
```

## dev server

In sbt:
```
sbt:laminar-vite2-example> fastLinkJS
// OR, if you want sbt to watch the source changes and rebuild continuosly
sbt:laminar-vite2-example> ~fastLinkJS
```

Then, start the dev server:

```console
$ yarn dev
```

## production build

In sbt:
```
sbt:laminar-vite2-example> fullLinkJS
```

In the `modules/website/index.html` uncomment the reference to the production `main.js` (TODO: automate this?)

Run the `build`:

```console
$ yarn build
```

The assets will end up in the `dist` directory.

* `index.*.js` ~`880K`
* `vendor.*.js` ~`43K`
* `index.*.css` ~`4.3K`

To preview the production build:

```console
$ yarn serve
```

## Scala 3

You can build this app with Scala 3:

* uncomment the corresponding line in the `build.sbt` (and comment the other one)
* update the `modules/website/index.html`

