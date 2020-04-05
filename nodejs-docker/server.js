'use strict';

const express = require('express');

// Constants
const PORT = 3000;
const HOST = '0.0.0.0';

// App
const app = express();
app.get('/', (req, res) => {
console.log('>>>>>>>>>>>>>>>1111111111111111-Response');
  res.send('Hello World');
});
console.log('>>>>>>>>>>>>>>>1111111111111111');
app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);