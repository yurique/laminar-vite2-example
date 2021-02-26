const colors = require('tailwindcss/colors')
const typography = require('@tailwindcss/typography')
const forms = require('@tailwindcss/forms')

module.exports = {
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
