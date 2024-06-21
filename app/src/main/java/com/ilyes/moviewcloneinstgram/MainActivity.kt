package com.ilyes.moviewcloneinstgram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilyes.moviewcloneinstgram.ui.theme.Instagram
import com.ilyes.moviewcloneinstgram.ui.theme.MoviewcloneinstgramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoviewcloneinstgramTheme {

            }
        }
    }
}

@Composable
fun Top(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(30.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth()
        ) {
            Spacer(modifier = modifier.width(15.dp))

            Text(
                text = "Instagram",
                fontSize = 40.sp,
                fontFamily = Instagram

            )
            Spacer(modifier = modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.messenger),
                contentDescription = "",
                modifier = modifier
                    .width(26.dp)
                    .height(26.dp)

                ,
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = modifier.width(25.dp))


        }


    }


}

@Preview(showBackground = true)
@Composable
fun TopPreview() {
    Surface {
        Top()

    }
}














@Composable
fun Story(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(text),
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}



@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun StoryPreview() {
    MoviewcloneinstgramTheme {
        Story(
            text = R.string.You,
            drawable = R.drawable.f433,
            modifier = Modifier.padding(8.dp)
        )
    }
}










@Composable
fun StoryRow(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = modifier.height(17.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(StoryRow) { item ->
                Story(item.drawable, item.text)
            }

        }
    }


}





















private val StoryRow = listOf(
    R.drawable.ilyes to R.string.You,
    R.drawable.f433 to R.string.f433,
    R.drawable.inter to R.string.inter,

).map { DrawableStringPair(it.first, it.second) }




















private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)


@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun StoryRowPreview() {
    MoviewcloneinstgramTheme {
        StoryRow()
    }
}












@Composable
fun InstagramBottomNavigation(modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = Color.White,
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    modifier = modifier
                        .height(40.dp)
                        .width(40.dp)
                )
            },

            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    modifier = modifier
                        .height(40.dp)
                        .width(40.dp)
                )
            },

            selected = false,
            onClick = {}
        )


        NavigationBarItem(
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.ilyes),
                    contentDescription = null,
                    modifier = modifier
                        .height(40.dp)
                        .width(40.dp)
                        .clip(CircleShape)

                )
            },

            selected = false,
            onClick = {}
        )
    }
}




@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun InstagramBottomNavigationPreview() {
    MoviewcloneinstgramTheme {
        InstagramBottomNavigation()
    }
}





@Composable
fun TopPost(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Spacer(modifier = modifier.width(9.dp))
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )



    }

}







@Preview(showBackground = true)
@Composable
fun TopPostPreview() {
    MoviewcloneinstgramTheme {
        TopPost(
            text = R.string.ilyes1,
            drawable = R.drawable.ilyes,
            modifier = Modifier.padding(8.dp)
        )
    }
}










@Composable
fun PostImage(
    @DrawableRes drawable1: Int,
    modifier: Modifier = Modifier
) {

    Image(
        painter = painterResource(drawable1),
        contentDescription = "",
        modifier = modifier
            .fillMaxWidth()
            .height(480.dp),
        contentScale = ContentScale.Crop
    )

}




@Preview(showBackground = true)
@Composable
fun PostImagePreview() {
    MoviewcloneinstgramTheme {
        PostImage(
            drawable1 = R.drawable.ilyespost,
        )
    }
}


















@Composable
fun PostBottom(
    @StringRes likes: Int,
    @StringRes text: Int,
    @StringRes comments: Int,
    @StringRes time: Int,

    @StringRes description: Int,
    @StringRes timeFormat: Int,




    modifier: Modifier = Modifier
) {
    Column(

    ){
        Spacer(modifier = modifier.height(5.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = modifier.width(12.dp))
            Icon(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "",

                )
            Spacer(modifier = modifier.width(25.dp))




        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = modifier.width(12.dp))

            Text(
                text = stringResource(likes),
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = modifier.width(4.dp))
            Text(
                text = "likes",
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )


        }





        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = modifier.width(8.dp))


            Image(
                painter = painterResource(id = R.drawable.ilyes),
                contentDescription = null,
                modifier = modifier
                    .height(35.dp)
                    .width(35.dp)
                    .clip(CircleShape)

            )




        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = modifier.width(12.dp))

            Text(
                text = stringResource(time),
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium,
            )
            Spacer(modifier = modifier.width(4.dp))
            Text(
                text = stringResource(timeFormat),
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium,
            )


        }




    }

}



@Preview(showBackground = true)
@Composable
fun PostBottomPreview() {
    MoviewcloneinstgramTheme {
        PostBottom(
            likes = R.string.likes1,
            text = R.string.ilyes1,
            description = R.string.description1,
            comments = R.string.comments1,
            time = R.string.time1,
            timeFormat = R.string.timeFormat1,

            )
    }
}























@Composable
fun Post(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    @DrawableRes drawable1: Int,
    @StringRes likes: Int,
    @StringRes comments: Int,
    @StringRes time: Int,
    @StringRes description: Int,
    @StringRes timeFormat: Int,
    modifier: Modifier = Modifier
) {
    Column {

        TopPost(
            text = text,
            drawable = drawable,
        )
        Spacer(modifier = modifier.height(7.dp))

        PostImage(
            drawable1 = drawable1,
        )
        PostBottom(
            likes = likes,
            text = text,
            description = description,
            comments = comments,
            time = time,
            timeFormat = timeFormat,

            )


    }


}



@Preview(showBackground = true)
@Composable
fun PostPreview() {
    MoviewcloneinstgramTheme {
        Post(
            text = R.string.ilyes1,
            drawable = R.drawable.ilyes,
            drawable1 = R.drawable.ilyespost,
            likes = R.string.likes1,
            description = R.string.description1,
            comments = R.string.comments1,
            time = R.string.time1,
            timeFormat = R.string.timeFormat1,


            )
    }
}



















@Composable
fun PostColumn(modifier: Modifier = Modifier) {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        contentPadding = PaddingValues(vertical = 4.dp),
        modifier = modifier
    ) {

        item {
            StoryRow()
        }
        items(PostList) { item ->
            Post(
                drawable = item.drawable,
                text = item.text,
                drawable1 = item.drawable1,
                likes = item.likes,
                comments = item.comments,
                time = item.time,
                description = item.description,
                timeFormat = item.timeFormat
            )
        }

    }

}


private data class PostData(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int,
    @DrawableRes val drawable1: Int,
    @StringRes val likes: Int,
    @StringRes val comments: Int,
    @StringRes val time: Int,
    @StringRes val description: Int,
    @StringRes val timeFormat: Int
)

















private val PostList = listOf(
    PostData(R.drawable.ilyes, R.string.ilyes1, R.drawable.ilyespost, R.string.likes1, R.string.comments1, R.string.time1, R.string.description1, R.string.timeFormat1),
    PostData(R.drawable.f433, R.string.f433, R.drawable.f433post, R.string.likes2, R.string.comments2, R.string.time2, R.string.description2, R.string.timeFormat2),
    PostData(R.drawable.inter, R.string.inter, R.drawable.interpost, R.string.likes3, R.string.comments3, R.string.time3, R.string.description3, R.string.timeFormat3),


    )



@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun PostColumnPreview() {
    MoviewcloneinstgramTheme {
        Scaffold(
            topBar = {
                Top()
            },
            bottomBar = {
                InstagramBottomNavigation()
            }

        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                PostColumn()



            }

        }    }
}





@Preview(showBackground = true,)
@Composable
fun FullScreenPreview() {
    MoviewcloneinstgramTheme {
        Scaffold(
            topBar = {
                Top()
            },
            bottomBar = {
                InstagramBottomNavigation()
            }

        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                PostColumn()



            }

        }
    }
}









