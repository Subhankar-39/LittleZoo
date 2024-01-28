package com.example.mymetarial

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.runtime.InternalComposeApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mymetarial.ui.theme.MyMetarialTheme
import com.example.mymetarial.ui.theme.myFont
import com.example.mymetarial.ui.theme.shapes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMetarialTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                    Myapp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Myapp(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Little Zoo",
                        modifier= Modifier.padding(start = 125.dp),
                        fontFamily = myFont
                        )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Red,
                    titleContentColor = Color.White
                ),
                actions = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .clickable {
                                Toast
                                    .makeText(context, "Search is clicked", Toast.LENGTH_LONG)
                                    .show()
                            },
                        tint = Color.White,
                    )
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .clickable {
                                Toast
                                    .makeText(context, "Add is clicked", Toast.LENGTH_LONG)
                                    .show()
                            },
                        tint = Color.White,
                    )
                },

            )
        },
        bottomBar = {
            BottomAppBar(
                contentColor = Color.Green,
                containerColor = Color.Red,
                modifier = Modifier.height(60.dp)
            ) {
                // Add your bottom bar content here
                IconButton(
                    onClick = {
                        Toast
                            .makeText(context, "Profile is clicked", Toast.LENGTH_LONG)
                            .show()
                    },
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(start = 20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Home",
                        tint = Color.White
                    )
                }
                bottombarButton(onClick = { Toast
                    .makeText(context, "Home is clicked", Toast.LENGTH_LONG)
                    .show() }, myIcon =Icons.Default.Home )
                bottombarButton(onClick = { Toast
                    .makeText(context, "Search is clicked", Toast.LENGTH_LONG)
                    .show() }, myIcon =Icons.Default.Search )
                bottombarButton(onClick = { Toast
                    .makeText(context, "Share is clicked", Toast.LENGTH_LONG)
                    .show() }, myIcon =Icons.Default.Share )

            }
        }
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
            .padding(top = 60.dp, bottom = 70.dp)) {
            item {
                myApp(painterResource(id = R.drawable.lion2), " My Lion ", " King of Jungle ",
                    stringResource(id = R.string.description_lion), painterResource(
                        id = R.drawable.lion
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.dog), " My Dog ", " Vou vou vou... ",
                    stringResource(id = R.string.description_dog), painterResource(
                        id = R.drawable.dog_2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.tiger2), " My Tiger ", " So Sexy ",
                    stringResource(id = R.string.description_tiger), painterResource(
                        id = R.drawable.tiger
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.ape), " My Ape ", " old man ",
                    stringResource(id = R.string.description_ape), painterResource(
                        id = R.drawable.ape2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.red_panda), " My Red-Panda ", " Our Cutie ",
                    stringResource(id = R.string.description_red_panda), painterResource(
                        id = R.drawable.red_panda2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.panda), " My panda ", " Awww... ",
                    stringResource(id = R.string.description_white_panda), painterResource(
                        id = R.drawable.panda2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.camel2), " My Camel ", " King of Sands ",
                    stringResource(id = R.string.description_camel), painterResource(
                        id = R.drawable.camel
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.elephant), "My Elephant ", " So big aww... ",
                    stringResource(id = R.string.description_elephant), painterResource(
                        id = R.drawable.elephant2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.giraffe), " My Giraffe ", " Wao long yeaa.. ",
                    stringResource(id = R.string.description_giraffe), painterResource(
                        id = R.drawable.giraffe2
                    ))
            }
            item {
                myApp(painterResource(id = R.drawable.cat), " My Cat ", " Sexy Pussy ",
                    stringResource(id = R.string.description_cat), painterResource(
                        id = R.drawable.cat2
                    ))
            }

        }
    }
}


@Composable
fun myApp(image: Painter, title: String, subtitle: String,mydescription:String,thumbnail:Painter) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.tertiaryContainer
        else MaterialTheme.colorScheme.primaryContainer,
    )
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .width(100.dp)
            //.height(100.dp),
        .animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
            )

            ),
        shape = shapes.large,
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color=color)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
                ,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = image,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .weight(1f)
                )
                Column(modifier = Modifier.weight(2f)) {
                    Text(
                        text = title,
                        fontWeight = FontWeight.Bold,
                        fontFamily = myFont
                    )
                    Text(text = subtitle)
                }
                ExpandItemButton(
                    expanded = expanded, onClick = { expanded = !expanded },
                    modifier = Modifier.weight(1f)
                )
            }
            // ExpandDisplay()
            //Text(text = "hello")
            if (expanded){
                ExpandDisplay(mydescription,thumbnail)
            }
        }
    }
}


//make expand button
@Composable
private fun ExpandItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Filled.ExpandMore,  // Add a comma here
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

//my expand display
@Composable
fun ExpandDisplay(description:String,banner:Painter,
    modifier: Modifier = Modifier.fillMaxSize()
){
    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = banner, contentDescription ="" )
        Text(text = description,
            modifier=Modifier.padding(16.dp),
            fontFamily = myFont,
            fontSize = 15.sp,
            )
    }
}

@Composable
fun bottombarButton(onClick: () -> Unit,myIcon:ImageVector){
    IconButton(
        onClick = onClick,
        modifier = Modifier.padding(20.dp)
    ) {
        Icon(
            imageVector = myIcon,
            contentDescription = "Home",
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyMetarialTheme {
        Myapp()
    }
}
