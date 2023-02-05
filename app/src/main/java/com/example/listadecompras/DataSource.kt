package com.example.listadecompras

import com.example.listadecompras.models.PurchaseItem

class DataSource {

    companion object{

            fun createDataSet() : ArrayList<PurchaseItem>{

                val list = ArrayList<PurchaseItem>()

                list.add(
                    PurchaseItem(
                        title = "Arroz Camil",
                        price = "R$3.00",
                        itemImageUrl = R.drawable.arroz_camil
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Feijão Camil",
                        price = "R$8.00",
                        itemImageUrl = R.drawable.feijao_camil
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Frango Seará",
                        price = "R$20.00",
                        itemImageUrl = R.drawable.frango_seara
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Sal Jasmine",
                        price = "R$2.00",
                        itemImageUrl = R.drawable.sal_jasmine
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Açucar União",
                        price = "R$5.00",
                        itemImageUrl = R.drawable.acucar_uniao
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Biscoito Treloso",
                        price = "R$2.00",
                        itemImageUrl = R.drawable.biscoito_treloso
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Suco Yulo",
                        price = "R$3.00",
                        itemImageUrl = R.drawable.suco_yulo
                    )
                )

                list.add(
                    PurchaseItem(
                        title = "Pepsi 2Lt",
                        price = "R$7.00",
                        itemImageUrl = R.drawable.pepsi_2lt
                    )
                )

                return list
            }

    }

}
