package io.flow.reference.data

import io.flow.reference.v0.models.CarrierService

object CarrierServices {

  val AsendiaExpress = CarrierService(id = "asendia-express", name = "Express", carrier = io.flow.reference.v0.models.Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/"))
  val AsendiaStandard = CarrierService(id = "asendia-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "asendia", name = "Asendia", trackingUrl = "https://track.aftership.com/asendia/"))
  val CanadaPostExpeditedParcel = CarrierService(id = "canada-post-expedited-parcel", name = "Expedited Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostPriority = CarrierService(id = "canada-post-priority", name = "Priority", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostRegularParcel = CarrierService(id = "canada-post-regular-parcel", name = "Regular Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val CanadaPostXpresspost = CarrierService(id = "canada-post-xpresspost", name = "Xpresspost", carrier = io.flow.reference.v0.models.Carrier(id = "canada-post", name = "Canada Post", trackingUrl = "https://track.aftership.com/canada-post/"))
  val DhlEcommerceStandard = CarrierService(id = "dhl-ecommerce-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-ecommerce", name = "DHL Ecommerce", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlExpressWorldwide = CarrierService(id = "dhl-express-worldwide", name = "Express Worldwide", carrier = io.flow.reference.v0.models.Carrier(id = "dhl", name = "DHL Express", trackingUrl = "http://www.dhl.com/en/express/tracking.html?AWB="))
  val DhlGlobalMailPacketPlus = CarrierService(id = "dhl-global-mail-packet-plus", name = "Packet Plus", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-global-mail", name = "DHL Global Mail", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlParcelInternationalDirect = CarrierService(id = "dhl-parcel-international-direct", name = "International Direct", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val DhlParcelInternationalStandard = CarrierService(id = "dhl-parcel-international-standard", name = "International Standard", carrier = io.flow.reference.v0.models.Carrier(id = "dhl-parcel", name = "DHL Parcel", trackingUrl = "https://webtrack.dhlglobalmail.com/?trackingnumber="))
  val FedexInternationalEconomy = CarrierService(id = "fedex-international-economy", name = "International Economy", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexInternationalPriority = CarrierService(id = "fedex-international-priority", name = "International Priority", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val FedexInternationalStandard = CarrierService(id = "fedex-international-standard", name = "International Standard", carrier = io.flow.reference.v0.models.Carrier(id = "fedex", name = "FedEx", trackingUrl = "https://www.fedex.com/apps/fedextrack/?tracknumbers="))
  val LaPosteColissimo = CarrierService(id = "la-poste-colissimo", name = "Colissimo", carrier = io.flow.reference.v0.models.Carrier(id = "la-poste", name = "La Poste", trackingUrl = "https://www.laposte.fr/particulier/outils/en/track-a-parcel?code="))
  val LandmarkGlobal = CarrierService(id = "landmark-global", name = "Global", carrier = io.flow.reference.v0.models.Carrier(id = "landmark", name = "Landmark", trackingUrl = "https://track.landmarkglobal.com/?trck="))
  val SfExpressEconomyExpressParcel = CarrierService(id = "sf-express-economy-express-parcel", name = "Economy Express Parcel", carrier = io.flow.reference.v0.models.Carrier(id = "sf-express", name = "SF Express", trackingUrl = "http://www.sf-express.com/us/en/dynamic_function/waybill/#search/bill-number/"))
  val UpsExpressSaver = CarrierService(id = "ups-express-saver", name = "Express Saver", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://track.aftership.com/ups/"))
  val UpsGround = CarrierService(id = "ups-ground", name = "Ground", carrier = io.flow.reference.v0.models.Carrier(id = "ups", name = "UPS", trackingUrl = "https://track.aftership.com/ups/"))
  val UspsPriorityMailInternational = CarrierService(id = "usps-priority-mail-international", name = "Priority Mail International", carrier = io.flow.reference.v0.models.Carrier(id = "usps", name = "USPS", trackingUrl = "https://track.aftership.com/usps/"))
  val WnDirectStandard = CarrierService(id = "wn-direct-standard", name = "Standard", carrier = io.flow.reference.v0.models.Carrier(id = "wn-direct", name = "WN Direct", trackingUrl = "http://wndirect.com/tracking.php?type=TR&ref="))

  val all = Seq(
    AsendiaExpress,
    AsendiaStandard,
    CanadaPostExpeditedParcel,
    CanadaPostPriority,
    CanadaPostRegularParcel,
    CanadaPostXpresspost,
    DhlEcommerceStandard,
    DhlExpressWorldwide,
    DhlGlobalMailPacketPlus,
    DhlParcelInternationalDirect,
    DhlParcelInternationalStandard,
    FedexInternationalEconomy,
    FedexInternationalPriority,
    FedexInternationalStandard,
    LaPosteColissimo,
    LandmarkGlobal,
    SfExpressEconomyExpressParcel,
    UpsExpressSaver,
    UpsGround,
    UspsPriorityMailInternational,
    WnDirectStandard
  )

}
