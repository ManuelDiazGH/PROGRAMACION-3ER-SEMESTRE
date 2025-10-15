import dotenv from 'dotenv';

dotenv.config();
const PORT = process.env.PORT;
const MODE = process.env.MODE;

console.log(`Servidor iniciado en el puerto ${PORT} en modo ${MODE}`);