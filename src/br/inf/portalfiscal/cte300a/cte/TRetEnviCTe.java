//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:26:58 PM BRT 
//


package br.inf.portalfiscal.cte300a.cte;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Retorno do Pedido de Concess�o de Autoriza��o da CT-e
 * 
 * <p>Classe Java de TRetEnviCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetEnviCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/cte}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/>
 *         &lt;element name="infRec" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nRec" type="{http://www.portalfiscal.inf.br/cte}TRec"/>
 *                   &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
 *                   &lt;element name="tMed">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="[0-9]{1,4}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetEnviCTe", propOrder = {
    "tpAmb",
    "cuf",
    "verAplic",
    "cStat",
    "xMotivo",
    "infRec"
})
public class TRetEnviCTe {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    protected TRetEnviCTe.InfRec infRec;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obt�m o valor da propriedade cuf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Define o valor da propriedade cuf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Obt�m o valor da propriedade verAplic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Define o valor da propriedade verAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Obt�m o valor da propriedade cStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Define o valor da propriedade cStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Obt�m o valor da propriedade xMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Define o valor da propriedade xMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Obt�m o valor da propriedade infRec.
     * 
     * @return
     *     possible object is
     *     {@link TRetEnviCTe.InfRec }
     *     
     */
    public TRetEnviCTe.InfRec getInfRec() {
        return infRec;
    }

    /**
     * Define o valor da propriedade infRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEnviCTe.InfRec }
     *     
     */
    public void setInfRec(TRetEnviCTe.InfRec value) {
        this.infRec = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nRec" type="{http://www.portalfiscal.inf.br/cte}TRec"/>
     *         &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
     *         &lt;element name="tMed">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="[0-9]{1,4}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nRec",
        "dhRecbto",
        "tMed"
    })
    public static class InfRec {

        @XmlElement(required = true)
        protected String nRec;
        @XmlElement(required = true)
        protected String dhRecbto;
        @XmlElement(required = true)
        protected BigInteger tMed;

        /**
         * Obt�m o valor da propriedade nRec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNRec() {
            return nRec;
        }

        /**
         * Define o valor da propriedade nRec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNRec(String value) {
            this.nRec = value;
        }

        /**
         * Obt�m o valor da propriedade dhRecbto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhRecbto() {
            return dhRecbto;
        }

        /**
         * Define o valor da propriedade dhRecbto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhRecbto(String value) {
            this.dhRecbto = value;
        }

        /**
         * Obt�m o valor da propriedade tMed.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTMed() {
            return tMed;
        }

        /**
         * Define o valor da propriedade tMed.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTMed(BigInteger value) {
            this.tMed = value;
        }

    }

}
