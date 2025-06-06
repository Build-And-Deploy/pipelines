// server.js

const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');

const app = express();
const port = 3001;

app.use(cors());
app.use(express.json());

app.get('/', (req, res) => {
    res.send('Server running.');
});

app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`)
});