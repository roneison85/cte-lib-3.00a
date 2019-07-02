//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:27:07 PM BRT 
//


package br.inf.portalfiscal.cte300a.evcecte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Comprovante de Entrega Eletr�nico do CT-e"/>
 *               &lt;enumeration value="Comprovante de Entrega Eletronico do CT-e"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt"/>
 *         &lt;element name="nDoc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhEntrega">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xNome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/cte}TLatitude" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/cte}TLongitude" minOccurs="0"/>
 *         &lt;element name="hashEntrega">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhHashEntrega">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infEntrega" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "descEvento",
    "nProt",
    "nDoc",
    "dhEntrega",
    "xNome",
    "latitude",
    "longitude",
    "hashEntrega",
    "dhHashEntrega",
    "infEntrega"
})
@XmlRootElement(name = "evCECTe", namespace = "http://www.portalfiscal.inf.br/cte")
public class EvCECTe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String nProt;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String nDoc;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dhEntrega;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String xNome;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String latitude;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String longitude;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected byte[] hashEntrega;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dhHashEntrega;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected List<EvCECTe.InfEntrega> infEntrega;

    /**
     * Obt�m o valor da propriedade descEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obt�m o valor da propriedade nProt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProt() {
        return nProt;
    }

    /**
     * Define o valor da propriedade nProt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProt(String value) {
        this.nProt = value;
    }

    /**
     * Obt�m o valor da propriedade nDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDoc() {
        return nDoc;
    }

    /**
     * Define o valor da propriedade nDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDoc(String value) {
        this.nDoc = value;
    }

    /**
     * Obt�m o valor da propriedade dhEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhEntrega() {
        return dhEntrega;
    }

    /**
     * Define o valor da propriedade dhEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhEntrega(String value) {
        this.dhEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade xNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNome() {
        return xNome;
    }

    /**
     * Define o valor da propriedade xNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNome(String value) {
        this.xNome = value;
    }

    /**
     * Obt�m o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obt�m o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obt�m o valor da propriedade hashEntrega.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHashEntrega() {
        return hashEntrega;
    }

    /**
     * Define o valor da propriedade hashEntrega.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHashEntrega(byte[] value) {
        this.hashEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade dhHashEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhHashEntrega() {
        return dhHashEntrega;
    }

    /**
     * Define o valor da propriedade dhHashEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhHashEntrega(String value) {
        this.dhHashEntrega = value;
    }

    /**
     * Gets the value of the infEntrega property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infEntrega property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfEntrega().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvCECTe.InfEntrega }
     * 
     * 
     */
    public List<EvCECTe.InfEntrega> getInfEntrega() {
        if (infEntrega == null) {
            infEntrega = new ArrayList<EvCECTe.InfEntrega>();
        }
        return this.infEntrega;
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
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
        "chNFe"
    })
    public static class InfEntrega {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String chNFe;

        /**
         * Obt�m o valor da propriedade chNFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Define o valor da propriedade chNFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

    }

}
