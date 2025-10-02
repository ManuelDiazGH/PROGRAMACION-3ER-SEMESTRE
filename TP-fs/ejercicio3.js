const fs = require('fs').promises;
const file = 'contactos.json';

async function readContacts() {
  const raw = await fs.readFile(file, 'utf8');
  return JSON.parse(raw);
}
async function writeContacts(c) {
  await fs.writeFile(file, JSON.stringify(c, null, 2));
}
async function agregarContacto(nombre, telefono, email) {
  const c = await readContacts();
  c.push({nombre, telefono, email});
  await writeContacts(c);
  console.log('Agregado:', nombre);
}
async function mostrarContactos() {
  console.table(await readContacts());
}
async function eliminarContacto(nombre) {
  let c = await readContacts();
  c = c.filter(x => x.nombre !== nombre);
  await writeContacts(c);
  console.log('Eliminado:', nombre);
}

(async ()=>{
  await agregarContacto('Carlos López','987-654-3210','carlos@example.com');
  await mostrarContactos();
  await eliminarContacto('Juan Pérez');
  await mostrarContactos();
})();
