import { resolve } from 'path'
import { minifyHtml, injectHtml } from 'vite-plugin-html'
import scalaVersion from './scala-version'

// https://vitejs.dev/config/
export default ({ mode }) => {
  const mainJS = `/target/scala-${scalaVersion}/website-${mode === 'production' ? 'opt' : 'fastopt'}/main.js`
  console.log('mainJS', mainJS)
  const script = `<script type="module" src="${mainJS}"></script>`

  return {
    publicDir: './src/main/static/public',
    plugins: [
      ...(process.env.NODE_ENV === 'production' ? [
        minifyHtml(),
      ] : []),
      injectHtml({
        injectData: {
          script
        }
      })
    ],
    resolve: {
      alias: {
        'stylesheets': resolve(__dirname, './src/main/static/stylesheets'),
        'website-config': mode === 'production' ?
          resolve(__dirname, '../website-config/prod') :
          resolve(__dirname, '../website-config/dev')
      }
    }
  }
}
