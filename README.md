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
$ yarn set version berry
$ yarn install
```

## dev server

In sbt:
```
sbt:laminar-vite2-example> fastLinkJS
// OR, if you want sbt to watch the source changes and rebuild continuosly
sbt:laminar-vite2-example> ~fastLinkJS
```

Then, start the Snowpack dev server (from a terminal – this is *not* a sbt command):

```console
$ yarn dev
```

## production build

In sbt:
```
sbt:laminar-vite2-example> fullLinkJS
```

Run the Snowpack `build` command:

```console
$ yarn build
```

To preview the production build:

```console
$ yarn serve
```

The assets will end up in the `dist` directory.

* `index.*.js` ~`891K` (~`928K` with Scala 3 RC1)
* `vendor.*.js` ~`43K`
* `index.*.css` ~`12K`

## Scala 3

You can build this app with Scala 3:

* uncomment the corresponding line in the `build.sbt` (and comment the other one)
* do the same in the `modules/website/index.html`

## TODO

The production build is partially broken: something goes wrong when Vite resolves an import from the npm dependency – `marked`,
it prints `Cannot call a namespace ('$i_marked')` and the `/embedded-file` page is broken in the production build. 

It works in dev mode, though.
