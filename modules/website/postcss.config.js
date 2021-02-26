module.exports = () => {
  return {
    plugins: [
      require('postcss-import')({}),
      require('postcss-preset-env')({}),
      process.env.NODE_ENV === 'production' ?
        require('tailwindcss')('./tailwind.prod.config.js') :
        require('tailwindcss')('./tailwind.dev.config.js'),
    ]
  };
}
