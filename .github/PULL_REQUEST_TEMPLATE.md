[description]: https://img.icons8.com/material-sharp/24/000000/document.png
[checkmark]: https://img.icons8.com/material-sharp/24/000000/checkmark.png
[checklist]: https://img.icons8.com/material-sharp/24/000000/check-all.png
[testing]: https://img.icons8.com/material-sharp/24/000000/test-partial-passed.png

# ![alt text][description] Descripción del PR
**¿Cuál es el comportamiento actual?**
> Describir brevemente el comportamiento actual que se relaciona con el cambio de este PR.

**¿Cuál es el comportamiento esperado con el nuevo cambio?**
> Describir brevemente cuál es el nuevo comportamiento con este PR y de qué forma mejora el comportamiento actual.

# ![alt text][testing] Pruebas

**¿Cómo probar el nuevo comportamiento?**
> Describir cuáles de qué forma se puede verificar el nuevo comportamiento.

# ![alt text][checklist] Checklist del PR

- [ ] Revisé cuidadosamente el código antes de crear el PR.
- [ ] Me aseguré que el diff claramente representa mis cambios.
- [ ] Me aseguré que este PR no tiene sentido dividirlo en PRs más pequeños.
- [ ] Verifiqué que el estilo de mi código y scaffolding adhieran al del proyecto.
- [ ] Me aseguré de que mis cambios no afectan otra funcionalidad que no sea la de este PR.
- [ ] Agregué los tests necesarios para el componente o funcionalidad que estoy implementando.
- [ ] Corrí los tests y me aseguré de que funcionan.
- [ ] Me aseguré de que cumple con los [SLAs](https://docs.google.com/document/d/18mlcq62oGLLxrf0QzhWc4U5l-VN6v0830tYU1943a7M/edit#heading=h.5c4u58krx1p0) descritos en los [Acuerdos operativos de credits](https://docs.google.com/document/d/18mlcq62oGLLxrf0QzhWc4U5l-VN6v0830tYU1943a7M/edit#heading=h.wdx5a7veff6).

## ![alt_text][checklist] Convención de merge:
<table style="width:100%">
  <tr>
    <th>Branch desde</th>
    <th>Branch hacia</th>
    <th>Merge commit</th>
    <th>Squash and Merge</th>
  </tr>
  <tr>
    <td>feature/</td>
    <td>develop</td>
    <td>&#10060</td>	
    <td>&#9989</td>
  </tr>
  <tr>
    <td>hotfix/</td>
    <td>master - release/</td>
    <td>&#10060</td>
    <td>&#9989</td>
  </tr>
  <tr>
    <td>fix/</td>
    <td>release/</td>
    <td>&#10060</td>
    <td>&#9989</td>
  </tr>
  <tr>
    <td>release/</td>
    <td>master</td>
    <td>&#9989</td>
    <td>&#10060</td>
  </tr>
  <tr>
    <td>backport/</td>
    <td>develop</td>
    <td>&#9989</td>
    <td>&#10060</td>
  </tr>
</table>

¿Qué pasa si hago <b>merge commit</b> cuando debía hacer un <b>squash</b>?
- Nada grave, simplemente nos estaríamos llevando commits innecesarios al branch donde mergeemos, ejemplo, si en mi branch feature/ tengo 15 commits y los comentarios no son descriptivos (fix, fix tests, working) me estaría llevando todos esos a develop, cuando con el Squash voy a llevar uno solo.

¿Qué pasa si hago <b>Squash</b> cuando debía hacer un <b>merge commit</b>?
- En este caso no estaríamos cumpliendo la función que esperamos que es llevar los commits de un branch a otro para emparejarlos, por ejemplo, cuando mergeamos una release a master, el objetivo es dejar parejos develop y master, y si usamos squash como estrategia de merge van a seguir teniendo commits distintos, por lo que en el siguiente release podríamos tener conflictos.