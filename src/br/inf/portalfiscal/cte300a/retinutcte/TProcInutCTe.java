//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:27:41 PM BRT 
//


package br.inf.portalfiscal.cte300a.retinutcte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de inutilza��o de n�mera��o de CT-e processado
 * 
 * <p>Classe Java de TProcInutCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TProcInutCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inutCTe" type="{http://www.portalfiscal.inf.br/cte}TInutCTe"/>
 *         &lt;element name="retInutCTe" type="{http://www.portalfiscal.inf.br/cte}TRetInutCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerInutCTe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcInutCTe", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "inutCTe",
    "retInutCTe"
})
public class TProcInutCTe {

    @XmlElement(required = true)
    protected TInutCTe inutCTe;
    @XmlElement(required = true)
    protected TRetInutCTe retInutCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obt�m o valor da propriedade inutCTe.
     * 
     * @return
     *     possible object is
     *     {@link TInutCTe }
     *     
     */
    public TInutCTe getInutCTe() {
        return inutCTe;
    }

    /**
     * Define o valor da propriedade inutCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TInutCTe }
     *     
     */
    public void setInutCTe(TInutCTe value) {
        this.inutCTe = value;
    }

    /**
     * Obt�m o valor da propriedade retInutCTe.
     * 
     * @return
     *     possible object is
     *     {@link TRetInutCTe }
     *     
     */
    public TRetInutCTe getRetInutCTe() {
        return retInutCTe;
    }

    /**
     * Define o valor da propriedade retInutCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetInutCTe }
     *     
     */
    public void setRetInutCTe(TRetInutCTe value) {
        this.retInutCTe = value;
    }

    /**
     * Obt�m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obt�m o valor da propriedade ipTransmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

}
