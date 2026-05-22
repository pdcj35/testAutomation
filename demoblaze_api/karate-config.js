function fn() {
  var env = karate.env || 'dev';
  var config = {
    baseUrl: 'https://api.demoblaze.com',
  };

  return config;
}