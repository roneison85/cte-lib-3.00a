//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:26:42 PM BRT 
//


package br.inf.portalfiscal.cte300a.ctemodalferroviario;

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
 *         &lt;element name="tpTraf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="trafMut" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="respFat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ferrEmi">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="chCTeFerroOrigem" type="{http://www.portalfiscal.inf.br/cte}TChNFe" minOccurs="0"/>
 *                   &lt;element name="ferroEnv" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="cInt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe" minOccurs="0"/>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderFerro" type="{http://www.portalfiscal.inf.br/cte}TEnderFer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fluxo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
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
    "tpTraf",
    "trafMut",
    "fluxo"
})
@XmlRootElement(name = "ferrov")
public class Ferrov {

    @XmlElement(required = true)
    protected String tpTraf;
    protected Ferrov.TrafMut trafMut;
    @XmlElement(required = true)
    protected String fluxo;

    /**
     * Obt�m o valor da propriedade tpTraf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpTraf() {
        return tpTraf;
    }

    /**
     * Define o valor da propriedade tpTraf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpTraf(String value) {
        this.tpTraf = value;
    }

    /**
     * Obt�m o valor da propriedade trafMut.
     * 
     * @return
     *     possible object is
     *     {@link Ferrov.TrafMut }
     *     
     */
    public Ferrov.TrafMut getTrafMut() {
        return trafMut;
    }

    /**
     * Define o valor da propriedade trafMut.
     * 
     * @param value
     *     allowed object is
     *     {@link Ferrov.TrafMut }
     *     
     */
    public void setTrafMut(Ferrov.TrafMut value) {
        this.trafMut = value;
    }

    /**
     * Obt�m o valor da propriedade fluxo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxo() {
        return fluxo;
    }

    /**
     * Define o valor da propriedade fluxo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxo(String value) {
        this.fluxo = value;
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
     *         &lt;element name="respFat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ferrEmi">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="chCTeFerroOrigem" type="{http://www.portalfiscal.inf.br/cte}TChNFe" minOccurs="0"/>
     *         &lt;element name="ferroEnv" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="cInt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe" minOccurs="0"/>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderFerro" type="{http://www.portalfiscal.inf.br/cte}TEnderFer"/>
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
        "respFat",
        "ferrEmi",
        "vFrete",
        "chCTeFerroOrigem",
        "ferroEnv"
    })
    public static class TrafMut {

        @XmlElement(required = true)
        protected String respFat;
        @XmlElement(required = true)
        protected String ferrEmi;
        @XmlElement(required = true)
        protected String vFrete;
        protected String chCTeFerroOrigem;
        protected List<Ferrov.TrafMut.FerroEnv> ferroEnv;

        /**
         * Obt�m o valor da propriedade respFat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRespFat() {
            return respFat;
        }

        /**
         * Define o valor da propriedade respFat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRespFat(String value) {
            this.respFat = value;
        }

        /**
         * Obt�m o valor da propriedade ferrEmi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFerrEmi() {
            return ferrEmi;
        }

        /**
         * Define o valor da propriedade ferrEmi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFerrEmi(String value) {
            this.ferrEmi = value;
        }

        /**
         * Obt�m o valor da propriedade vFrete.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVFrete() {
            return vFrete;
        }

        /**
         * Define o valor da propriedade vFrete.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVFrete(String value) {
            this.vFrete = value;
        }

        /**
         * Obt�m o valor da propriedade chCTeFerroOrigem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChCTeFerroOrigem() {
            return chCTeFerroOrigem;
        }

        /**
         * Define o valor da propriedade chCTeFerroOrigem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChCTeFerroOrigem(String value) {
            this.chCTeFerroOrigem = value;
        }

        /**
         * Gets the value of the ferroEnv property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ferroEnv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFerroEnv().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ferrov.TrafMut.FerroEnv }
         * 
         * 
         */
        public List<Ferrov.TrafMut.FerroEnv> getFerroEnv() {
            if (ferroEnv == null) {
                ferroEnv = new ArrayList<Ferrov.TrafMut.FerroEnv>();
            }
            return this.ferroEnv;
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
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="cInt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe" minOccurs="0"/>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderFerro" type="{http://www.portalfiscal.inf.br/cte}TEnderFer"/>
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
            "cnpj",
            "cInt",
            "ie",
            "xNome",
            "enderFerro"
        })
        public static class FerroEnv {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            protected String cInt;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(required = true)
            protected TEnderFer enderFerro;

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
             * Obt�m o valor da propriedade cInt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCInt() {
                return cInt;
            }

            /**
             * Define o valor da propriedade cInt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCInt(String value) {
                this.cInt = value;
            }

            /**
             * Obt�m o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
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
             * Obt�m o valor da propriedade enderFerro.
             * 
             * @return
             *     possible object is
             *     {@link TEnderFer }
             *     
             */
            public TEnderFer getEnderFerro() {
                return enderFerro;
            }

            /**
             * Define o valor da propriedade enderFerro.
             * 
             * @param value
             *     allowed object is
             *     {@link TEnderFer }
             *     
             */
            public void setEnderFerro(TEnderFer value) {
                this.enderFerro = value;
            }

        }

    }

}
