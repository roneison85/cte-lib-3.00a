//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:27:22 PM BRT 
//


package br.inf.portalfiscal.cte300a.proccte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTe" type="{http://www.portalfiscal.inf.br/cte}TCTe"/>
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cTe",
    "protCTe"
})
@XmlRootElement(name = "cteProc")
public class CteProc {

    @XmlElement(name = "CTe", required = true)
    protected TCTe cTe;
    @XmlElement(required = true)
    protected TProtCTe protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obt�m o valor da propriedade cTe.
     * 
     * @return
     *     possible object is
     *     {@link TCTe }
     *     
     */
    public TCTe getCTe() {
        return cTe;
    }

    /**
     * Define o valor da propriedade cTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTe }
     *     
     */
    public void setCTe(TCTe value) {
        this.cTe = value;
    }

    /**
     * Obt�m o valor da propriedade protCTe.
     * 
     * @return
     *     possible object is
     *     {@link TProtCTe }
     *     
     */
    public TProtCTe getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtCTe }
     *     
     */
    public void setProtCTe(TProtCTe value) {
        this.protCTe = value;
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
