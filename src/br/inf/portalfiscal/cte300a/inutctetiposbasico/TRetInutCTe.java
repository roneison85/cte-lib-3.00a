//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:27:16 PM BRT 
//


package br.inf.portalfiscal.cte300a.inutctetiposbasico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo retorno do Pedido de Inutiliza��o de Numera��o do Conhecimento de Transporte eletr�nico
 * 
 * <p>Classe Java de TRetInutCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetInutCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infInut">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                   &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/>
 *                   &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/cte}TStat"/>
 *                   &lt;element name="xMotivo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="255"/>
 *                         &lt;whiteSpace value="collapse"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *                   &lt;element name="ano" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                         &lt;pattern value="[0-9]{1,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj" minOccurs="0"/>
 *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT_Carga_OS" minOccurs="0"/>
 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
 *                   &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF" minOccurs="0"/>
 *                   &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF" minOccurs="0"/>
 *                   &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" minOccurs="0"/>
 *                   &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerInutCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetInutCTe", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "infInut",
    "signature"
})
public class TRetInutCTe {

    @XmlElement(required = true)
    protected TRetInutCTe.InfInut infInut;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade infInut.
     * 
     * @return
     *     possible object is
     *     {@link TRetInutCTe.InfInut }
     *     
     */
    public TRetInutCTe.InfInut getInfInut() {
        return infInut;
    }

    /**
     * Define o valor da propriedade infInut.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetInutCTe.InfInut }
     *     
     */
    public void setInfInut(TRetInutCTe.InfInut value) {
        this.infInut = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/>
     *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/cte}TStat"/>
     *         &lt;element name="xMotivo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="255"/>
     *               &lt;whiteSpace value="collapse"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
     *         &lt;element name="ano" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *               &lt;pattern value="[0-9]{1,2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj" minOccurs="0"/>
     *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT_Carga_OS" minOccurs="0"/>
     *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
     *         &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF" minOccurs="0"/>
     *         &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF" minOccurs="0"/>
     *         &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" minOccurs="0"/>
     *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpAmb",
        "verAplic",
        "cStat",
        "xMotivo",
        "cuf",
        "ano",
        "cnpj",
        "mod",
        "serie",
        "nctIni",
        "nctFin",
        "dhRecbto",
        "nProt"
    })
    public static class InfInut {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String tpAmb;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String verAplic;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cStat;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String xMotivo;
        @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cuf;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected Short ano;
        @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cnpj;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String mod;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String serie;
        @XmlElement(name = "nCTIni", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String nctIni;
        @XmlElement(name = "nCTFin", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String nctFin;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String dhRecbto;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String nProt;
        @XmlAttribute(name = "Id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

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
         * Obt�m o valor da propriedade ano.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getAno() {
            return ano;
        }

        /**
         * Define o valor da propriedade ano.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setAno(Short value) {
            this.ano = value;
        }

        /**
         * Obt�m o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obt�m o valor da propriedade mod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMod() {
            return mod;
        }

        /**
         * Define o valor da propriedade mod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMod(String value) {
            this.mod = value;
        }

        /**
         * Obt�m o valor da propriedade serie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Define o valor da propriedade serie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Obt�m o valor da propriedade nctIni.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCTIni() {
            return nctIni;
        }

        /**
         * Define o valor da propriedade nctIni.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCTIni(String value) {
            this.nctIni = value;
        }

        /**
         * Obt�m o valor da propriedade nctFin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCTFin() {
            return nctFin;
        }

        /**
         * Define o valor da propriedade nctFin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCTFin(String value) {
            this.nctFin = value;
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
         * Obt�m o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
