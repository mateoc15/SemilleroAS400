/// <reference types="Cypress" />

context('Pagina de google', () => {
  beforeEach(() => {
    cy.visit('https://google.com.co')
  })

  it('Buscar en google', () => {
    cy.get('.gLFyf').blur().type('Cypress tutorial').should('have.value', 'Cypress tutorial')
    cy.get('.aajZCb > .VlcLAe > center > [value="Buscar con Google"]').click()

    cy.screenshot('validación')
    cy.title().should('include', 'Cypress tutorial')


  })

  it('Buscar en google con dato desde el fixture', () => {
    cy.fixture('/user/busqueda.json').then((fixture) => {
      cy.get('.gLFyf').blur().type(fixture.texto).should('have.value', fixture.texto)
      cy.get('.aajZCb > .VlcLAe > center > [value="Buscar con Google"]').click()
      cy.screenshot('validación con fixture')
      cy.title().should('include', fixture.texto)
    })


  })


  

})
