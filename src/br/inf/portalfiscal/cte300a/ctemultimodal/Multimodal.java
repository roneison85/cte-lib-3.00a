//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.02 �s 05:26:50 PM BRT 
//


package br.inf.portalfiscal.cte300a.ctemultimodal;

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
 *         &lt;element name="COTM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="[!-�]{1}[ -�]{0,}[!-�]{1}|[!-�]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indNegociavel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="seg" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infSeg">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xSeg">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nApol">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nAver">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
    "cotm",
    "indNegociavel",
    "seg"
})
@XmlRootElement(name = "multimodal")
public class Multimodal {

    @XmlElement(name = "COTM", required = true)
    protected String cotm;
    @XmlElement(required = true)
    protected String indNegociavel;
    protected Multimodal.Seg seg;

    /**
     * Obt�m o valor da propriedade cotm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOTM() {
        return cotm;
    }

    /**
     * Define o valor da propriedade cotm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOTM(String value) {
        this.cotm = value;
    }

    /**
     * Obt�m o valor da propriedade indNegociavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNegociavel() {
        return indNegociavel;
    }

    /**
     * Define o valor da propriedade indNegociavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNegociavel(String value) {
        this.indNegociavel = value;
    }

    /**
     * Obt�m o valor da propriedade seg.
     * 
     * @return
     *     possible object is
     *     {@link Multimodal.Seg }
     *     
     */
    public Multimodal.Seg getSeg() {
        return seg;
    }

    /**
     * Define o valor da propriedade seg.
     * 
     * @param value
     *     allowed object is
     *     {@link Multimodal.Seg }
     *     
     */
    public void setSeg(Multimodal.Seg value) {
        this.seg = value;
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
     *         &lt;element name="infSeg">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xSeg">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nApol">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nAver">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
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
        "infSeg",
        "nApol",
        "nAver"
    })
    public static class Seg {

        @XmlElement(required = true)
        protected Multimodal.Seg.InfSeg infSeg;
        @XmlElement(required = true)
        protected String nApol;
        @XmlElement(required = true)
        protected String nAver;

        /**
         * Obt�m o valor da propriedade infSeg.
         * 
         * @return
         *     possible object is
         *     {@link Multimodal.Seg.InfSeg }
         *     
         */
        public Multimodal.Seg.InfSeg getInfSeg() {
            return infSeg;
        }

        /**
         * Define o valor da propriedade infSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link Multimodal.Seg.InfSeg }
         *     
         */
        public void setInfSeg(Multimodal.Seg.InfSeg value) {
            this.infSeg = value;
        }

        /**
         * Obt�m o valor da propriedade nApol.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNApol() {
            return nApol;
        }

        /**
         * Define o valor da propriedade nApol.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNApol(String value) {
            this.nApol = value;
        }

        /**
         * Obt�m o valor da propriedade nAver.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAver() {
            return nAver;
        }

        /**
         * Define o valor da propriedade nAver.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAver(String value) {
            this.nAver = value;
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
         *         &lt;element name="xSeg">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
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
            "xSeg",
            "cnpj"
        })
        public static class InfSeg {

            @XmlElement(required = true)
            protected String xSeg;
            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;

            /**
             * Obt�m o valor da propriedade xSeg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSeg() {
                return xSeg;
            }

            /**
             * Define o valor da propriedade xSeg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSeg(String value) {
                this.xSeg = value;
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

        }

    }

}
