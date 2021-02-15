<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet version="2.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xs="https://www.w3.org/2001/XMLSchema"
>
  <xsl:template match="/">
    <html>
      <head>
        <link rel="stylesheet" type="text/css" href="main.css" />   
      </head>
      <body>
        <div class="wrapper">
          <h3>RIB :<xsl:value-of  select="releve/@RIB" /> </h3>
          <h3>Date de Relevé :<xsl:value-of  select="releve/dateReleve" /> </h3>
          <h3>votre Solde :<xsl:value-of  select="releve/solde" /> </h3>
          <table class="table">
            <tr class="row header">
              <th>Type D'operation</th>
              <th>Date D'operation</th>
              <th>Montant D'operation</th>
              <th>Description D'operation</th>
            </tr>
            <xsl:for-each select="releve/operations/operation">
              <tr class="row">
                <td class="cell"><xsl:value-of select="@type" ></xsl:value-of></td>
                <td class="cell"><xsl:value-of select="@date" ></xsl:value-of></td>
                <td class="cell"><xsl:value-of select="@montant" ></xsl:value-of></td>
                <td class="cell"><xsl:value-of select="@description" ></xsl:value-of></td>
              </tr>
            </xsl:for-each>
            <tr class="row header green">
              <td colspan="2" class="cell"> Nombre D'opération Credit :</td>
              <td colspan="2" class="cell" style="text-align:center;"><xsl:value-of select="count(releve/operations/operation[@type='CREDIT'])"></xsl:value-of></td>
            </tr>
            <tr class="row header">
              <td colspan="2" class="cell"> Nombre D'opération DEBIT :</td>
              <td colspan="2" class="cell" style="text-align:center;"><xsl:value-of select="count(releve/operations/operation[@type='DEBIT'])"></xsl:value-of></td>
            </tr>
          </table>
        </div>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>