package com.example.greenrecicle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenrecicle.ui.theme.GreenRecicleTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.launch
import androidx.compose.foundation.lazy.rememberLazyListState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreenRecicleTheme {
                GreenRecicleApp()
            }
        }
    }
}


@Composable
fun GreenRecicleApp() {
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color(0xFFB7D2B6)
    ) {
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(100.dp),
                    content = {
                        Text(
                            text = "GREEN RECYCLE",
                            modifier = Modifier.fillMaxWidth()
                                .padding(35.dp),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            fontSize = 27.sp,
                            color = Color(0xFFF2F5F7)
                        )
                    },
                    shape = RectangleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF267D39)
                    )
                )
            }
            item {
                Spacer(modifier = Modifier.height(40.dp))




                Column() {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Button(
                            onClick = {
                                scope.launch { listState.animateScrollToItem(2) }
                            },
                            modifier = Modifier.width(180.dp)
                                .padding(11.dp)
                                .height(220.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF0000FF)
                            )
                        ) {
                            Text(
                                text = "Papel",
                                fontSize = 20.sp,
                                color = Color(0xFFF2F5F7),
                            )
                        }

                        Button(
                            onClick = {
                                scope.launch { listState.animateScrollToItem(3) }
                            },
                            modifier = Modifier.width(180.dp)
                                .padding(11.dp)
                                .height(220.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFBE2414)
                            )
                        ) {
                            Text(
                                text = "Plástico",
                                fontSize = 20.sp,
                                color = Color(0xFFF2F5F7),
                            )
                        }
                    }


                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Button(
                            onClick = {
                                scope.launch { listState.animateScrollToItem(4) }
                            },
                            modifier = Modifier.width(180.dp)
                                .padding(11.dp)
                                .height(220.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFDFA400)
                            )
                        ) {
                            Text(
                                text = "Metal",
                                fontSize = 20.sp,
                                color = Color(0xFFF2F5F7),

                                )
                        }

                        Button(
                            onClick = {
                                scope.launch { listState.animateScrollToItem(5) }
                            },
                            modifier = Modifier.width(180.dp)
                                .padding(11.dp)
                                .height(220.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF004D00)
                            )
                        ) {
                            Text(
                                text = "Vidro",
                                fontSize = 20.sp,
                                color = Color(0xFFF2F5F7),

                                )
                        }

                    }
                }
                Button(
                    onClick = {
                        scope.launch { listState.animateScrollToItem(6) }
                    },
                    modifier = Modifier.width(550.dp)
                        .padding(15.dp)
                        .height(150.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF000000)
                    )
                ) {
                    Text(
                        text = "Locais de coleta",
                        fontSize = 20.sp,
                        color = Color(0xFFF2F5F7),
                    )
                }
            }


            item {
                Spacer(modifier = Modifier.height(270.dp))
                Text(
                    text = " ----- Coleta Seletiva ----- ",
                    modifier = Modifier.fillMaxWidth(),
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF005452),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.lixeirablue),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .size(245.dp)

                    )
                }
                Text(
                    text = "Lixeira de Coleta Seletiva Azul:",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFF0000FF)
                )
                Text(
                    text = "A lixeira azul é direcionada para o descarte de papéis e papelão.\n" +
                            "Deve se descartar:\n " +
                            "1.Jornais.\n " +
                            "2.Revistas.\n" +
                            "3.Caixas de papelão.\n " +
                            "4.Folhas de caderno.\n " +
                            "5.Envelopes.\n" +
                            "6.Embalagens de papel.\n",
                    modifier = Modifier.padding(start = 10.dp),
                    textAlign = TextAlign.Justify
                )
            }
            item {
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.lixeirared),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .size(250.dp)


                    )
                }
                Text(
                    text = "Lixeira de Coleta Seletiva Vermelha:",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFFBE2414)
                )
                Text(
                    text = "A lixeira vermelha é destinada ao descarte de plásticos.\n " +
                            "Deve se descartar:\n" +
                            "1.Garrafas PET.\n" +
                            "2.Potes.\n" +
                            "3.Embalagens de produtos de limpeza.\n" +
                            "4.Sacolas.\n" +
                            "5.Copos descartáveis.\n" +
                            "6.Tampinhas.\n" +
                            "7.Canetas.\n",
                    modifier = Modifier.padding(start = 10.dp),
                    textAlign = TextAlign.Justify
                )
            }
            item {
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.amarela1),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .size(170.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Lixeira de Coleta Seletiva Amarela:",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFFDFA400)
                )
                Text(
                    text = "A lixeira amarela é destinada ao descarte de materias metálicos.\n" +
                            "Deve se descartar:\n" +
                            "Latas de alumínio.\n" +
                            "Latas de aço.\n" +
                            "Panelas sem cabo.\n" +
                            "Papel alumínop limpo.\n" +
                            "Aerossóis.\n" +
                            "Ferragens.\n" +
                            "Canos.\n" +
                            "Pregos.\n",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify
                )
            }
            item {
                Spacer(modifier = Modifier.height(50.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.verde1),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .size(250.dp)
                    )
                }
                Text(
                    text = "Lixeira de Coleta Seletiva Verde:",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFF008000)
                )
                Text(
                    text = "A lixeira verde é destinada ao descarte de vidros.\n" +
                            "Deve se descartar:\n" +
                            "1.Garrafas de vidro.\n" +
                            "2.Potes de conserva.\n" +
                            "3.Frascos de perfume e remédios.\n" +
                            "4.Copos de vidro.\n",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify
                )
            }
            item {
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "Pontos de Coleta em Goiânia:\n",
                    modifier = Modifier.fillMaxWidth(),
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF005452),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = " Ecopontos (Entulho, Móveis, Pneus e Podas):\n \n" +
                            "1.Ecoponto Guanabara: Rua GB-5, Qd. 33, Lt. 24, Jardim Guanabara.\n" +
                            "2.Ecoponto Faiçalville: Avenida Madrid, Qd. 121, Setor Faiçalville.\n" +
                            "3.Ecoponto São José: Rua J-40, Qd. 66, Lt. 19, Jardim São José.\n" +
                            "4.Ecoponto Campos Dourados: Rua São Salvador, Qd. 14, Lt. 17, Res. Campos Dourados.\n" +
                            "5.Ecoponto Eldorado Oeste: Rua Nd-54, Qd. 38, Lt. 01, Res. Parque Eldorado Oeste.\n \n" +
                            "Recicláveis (Papel, Plástico, Metal e Vidro):\n \n" +
                            "1.Setor Bueno: Praça T-23.\n" +
                            "2.Setor Bueno: Parque Vaca Brava (Avenida T-3 com Rua T-66).\n" +
                            "3.Setor Sul: Praça Cívica.\n" +
                            "4.Setor Sul: Cepal do Setor Sul (Rua 115).\n" +
                            "5.Parque Lozandes: Paço Municipal (Avenida do Cerrado, nº 999).\n" +
                            "6.Setor Campinas: Praça Joaquim Lúcio.\n \n" +
                            "Lixo Eletrônico, Pilhas e Lâmpadas Residencial:\n \n" +
                            "1.Celina Park: Rua CP 4, Qd. CP 4, Lt. 3 (Disponível 24h).",
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify
                )
            }
            item {
                Spacer(modifier = Modifier.height(60.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(230.dp),
                    content = {
                        Text(
                            text = "\nEquipe\n",
                            modifier = Modifier.fillMaxWidth()
                                .padding(start = 10.dp),
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF2F5F7),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Justify,
                        )
                        Text(
                            text = "Yuna Dias.\n" +
                                    "Marina Martins.\n" +
                                    "Enzo Rodrigues.\n" +
                                    "Artur da Silva.\n" +
                                    "Nicholas Haran.\n",
                            modifier = Modifier.padding(start = 10.dp),
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Justify,
                            color = Color(0xBFF2F5F7)
                        )
                    },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xBF004D00)
                    )
                )
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreenReciclePreview() {
    GreenRecicleTheme {
        GreenRecicleApp()
    }
}