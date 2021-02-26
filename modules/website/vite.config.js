import path from 'path'

// https://vitejs.dev/config/
export default ({ mode }) => ({
  resolve: {
    alias: {
      'stylesheets': path.resolve(__dirname, './src/main/static/stylesheets'),
      'website-config': mode === 'production' ?
        path.resolve(__dirname, '../website-config/prod') :
        path.resolve(__dirname, '../website-config/dev')
    }
  }
})
