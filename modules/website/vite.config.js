import { resolve } from 'path'

// https://vitejs.dev/config/
export default ({ mode }) => ({
  resolve: {
    alias: {
      'stylesheets': resolve(__dirname, './src/main/static/stylesheets'),
      'website-config': mode === 'production' ?
        resolve(__dirname, '../website-config/prod') :
        resolve(__dirname, '../website-config/dev')
    }
  }
})
