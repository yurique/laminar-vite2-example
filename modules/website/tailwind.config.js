const colors = require('tailwindcss/colors')
const typography = require('@tailwindcss/typography')
const forms = require('@tailwindcss/forms')
const scalaVersion = require('./scala-version')
const path = require('path')
const scalajsMode = process.env.NODE_ENV === 'production' === 'production' ? 'opt' : 'fastopt'

module.exports = {
    mode: 'jit',
    purge: [
      path.resolve(__dirname, `./target/scala-${scalaVersion}/website-${scalajsMode}/*.js`),
      path.resolve(__dirname, './*.html'),
    ],
    theme: {
      extend: {
        fontFamily: {
          serif: ['Inter', 'ui-serif', 'Georgia', 'Cambria', '"Times New Roman"', 'Times', 'serif'],
        },
        colors: {
          gray: colors.coolGray,
        },
      },
    },
    corePlugins: {},
    plugins: [typography, forms],
}
