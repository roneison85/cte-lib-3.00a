//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:26:45 PM BRT 
//


package br.inf.portalfiscal.cte300a.ctemodalrodoviarioos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice>
 *           &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
 *           &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
 *         &lt;/choice>
 *         &lt;element name="veic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="placa">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RENAVAM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="9"/>
 *                         &lt;maxLength value="11"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prop" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
 *                               &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
 *                             &lt;/choice>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="IE">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;/sequence>
 *                             &lt;element name="tpProp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infFretamento" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpFretamento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dhViagem" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" minOccurs="0"/>
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
    "taf",
    "nroRegEstadual",
    "veic",
    "infFretamento"
})
@XmlRootElement(name = "rodoOS")
public class RodoOS {

    @XmlElement(name = "TAF")
    protected String taf;
    @XmlElement(name = "NroRegEstadual")
    protected String nroRegEstadual;
    protected RodoOS.Veic veic;
    protected RodoOS.InfFretamento infFretamento;

    /**
     * Obt�m o valor da propriedade taf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAF() {
        return taf;
    }

    /**
     * Define o valor da propriedade taf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAF(String value) {
        this.taf = value;
    }

    /**
     * Obt�m o valor da propriedade nroRegEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRegEstadual() {
        return nroRegEstadual;
    }

    /**
     * Define o valor da propriedade nroRegEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRegEstadual(String value) {
        this.nroRegEstadual = value;
    }

    /**
     * Obt�m o valor da propriedade veic.
     * 
     * @return
     *     possible object is
     *     {@link RodoOS.Veic }
     *     
     */
    public RodoOS.Veic getVeic() {
        return veic;
    }

    /**
     * Define o valor da propriedade veic.
     * 
     * @param value
     *     allowed object is
     *     {@link RodoOS.Veic }
     *     
     */
    public void setVeic(RodoOS.Veic value) {
        this.veic = value;
    }

    /**
     * Obt�m o valor da propriedade infFretamento.
     * 
     * @return
     *     possible object is
     *     {@link RodoOS.InfFretamento }
     *     
     */
    public RodoOS.InfFretamento getInfFretamento() {
        return infFretamento;
    }

    /**
     * Define o valor da propriedade infFretamento.
     * 
     * @param value
     *     allowed object is
     *     {@link RodoOS.InfFretamento }
     *     
     */
    public void setInfFretamento(RodoOS.InfFretamento value) {
        this.infFretamento = value;
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
     *         &lt;element name="tpFretamento">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dhViagem" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" minOccurs="0"/>
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
        "tpFretamento",
        "dhViagem"
    })
    public static class InfFretamento {

        @XmlElement(required = true)
        protected String tpFretamento;
        protected String dhViagem;

        /**
         * Obt�m o valor da propriedade tpFretamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpFretamento() {
            return tpFretamento;
        }

        /**
         * Define o valor da propriedade tpFretamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpFretamento(String value) {
            this.tpFretamento = value;
        }

        /**
         * Obt�m o valor da propriedade dhViagem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhViagem() {
            return dhViagem;
        }

        /**
         * Define o valor da propriedade dhViagem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhViagem(String value) {
            this.dhViagem = value;
        }

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
     *         &lt;element name="placa">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RENAVAM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="9"/>
     *               &lt;maxLength value="11"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prop" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
     *                     &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
     *                   &lt;/choice>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="IE">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;/sequence>
     *                   &lt;element name="tpProp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
        "placa",
        "renavam",
        "prop",
        "uf"
    })
    public static class Veic {

        @XmlElement(required = true)
        protected String placa;
        @XmlElement(name = "RENAVAM")
        protected String renavam;
        protected RodoOS.Veic.Prop prop;
        @XmlElement(name = "UF", required = true)
        @XmlSchemaType(name = "string")
        protected TUf uf;

        /**
         * Obt�m o valor da propriedade placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define o valor da propriedade placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

        /**
         * Obt�m o valor da propriedade renavam.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRENAVAM() {
            return renavam;
        }

        /**
         * Define o valor da propriedade renavam.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRENAVAM(String value) {
            this.renavam = value;
        }

        /**
         * Obt�m o valor da propriedade prop.
         * 
         * @return
         *     possible object is
         *     {@link RodoOS.Veic.Prop }
         *     
         */
        public RodoOS.Veic.Prop getProp() {
            return prop;
        }

        /**
         * Define o valor da propriedade prop.
         * 
         * @param value
         *     allowed object is
         *     {@link RodoOS.Veic.Prop }
         *     
         */
        public void setProp(RodoOS.Veic.Prop value) {
            this.prop = value;
        }

        /**
         * Obt�m o valor da propriedade uf.
         * 
         * @return
         *     possible object is
         *     {@link TUf }
         *     
         */
        public TUf getUF() {
            return uf;
        }

        /**
         * Define o valor da propriedade uf.
         * 
         * @param value
         *     allowed object is
         *     {@link TUf }
         *     
         */
        public void setUF(TUf value) {
            this.uf = value;
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
         *         &lt;choice>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
         *           &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
         *         &lt;/choice>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="IE">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;/sequence>
         *         &lt;element name="tpProp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
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
            "cpf",
            "cnpj",
            "taf",
            "nroRegEstadual",
            "xNome",
            "ie",
            "uf",
            "tpProp"
        })
        public static class Prop {

            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "TAF")
            protected String taf;
            @XmlElement(name = "NroRegEstadual")
            protected String nroRegEstadual;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(name = "UF")
            @XmlSchemaType(name = "string")
            protected TUf uf;
            @XmlElement(required = true)
            protected String tpProp;

            /**
             * Obt�m o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
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
             * Obt�m o valor da propriedade taf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAF() {
                return taf;
            }

            /**
             * Define o valor da propriedade taf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAF(String value) {
                this.taf = value;
            }

            /**
             * Obt�m o valor da propriedade nroRegEstadual.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroRegEstadual() {
                return nroRegEstadual;
            }

            /**
             * Define o valor da propriedade nroRegEstadual.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroRegEstadual(String value) {
                this.nroRegEstadual = value;
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
             * Obt�m o valor da propriedade uf.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUF() {
                return uf;
            }

            /**
             * Define o valor da propriedade uf.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUF(TUf value) {
                this.uf = value;
            }

            /**
             * Obt�m o valor da propriedade tpProp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpProp() {
                return tpProp;
            }

            /**
             * Define o valor da propriedade tpProp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpProp(String value) {
                this.tpProp = value;
            }

        }

    }

}
