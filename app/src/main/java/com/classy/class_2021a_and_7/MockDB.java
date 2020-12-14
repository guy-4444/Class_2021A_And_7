package com.classy.class_2021a_and_7;

import java.util.ArrayList;

public class MockDB {

    public static ArrayList<Post> generatePosts() {
        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post()
                .setAuthor("Shlomo Arzi")
                .setContent("Shlomo Artzi appears in Caesarea for the 500th time in his life")
                .setUserImageUrl("https://4.bp.blogspot.com/-a88w5soOM_k/UFSPNgFFSVI/AAAAAAAAAY4/qYvT0wO2XfY/s1600/1.jpg")
                .setImageUrl("https://lp-cms-production.imgix.net/2019-06/a4e017655dd0a34ae19d7b41956f0450-caesarea-national-park.jpg")
                .setLikes(23));

        posts.add(new Post()
                .setAuthor("Madona")
                .setContent("Madona in Israel")
                .setUserImageUrl("https://www.israelhayom.co.il/sites/default/files/styles/566x349/public/images/articles/2019/07/07/15624551620308_b.jpg")
                .setImageUrl("https://www.israelhayom.co.il/sites/default/files/u79157/15582558969343_b.jpg")
                .setLikes(5));

        posts.add(new Post()
                .setAuthor("English")
                .setContent("teacher teaches class in english")
                .setUserImageUrl("https://media.edutopia.org/styles/responsive_2880px_16x9/s3/masters/d7_images/cover_media/alber-169hero-thelook-shutterstock_0.jpg")
                .setImageUrl("https://www.click2houston.com/resizer/iDwVVd3hXTT53KUwAYxv2cOSuqo=/1600x1143/smart/filters:format(jpeg):strip_exif(true):strip_icc(true):no_upscale(true):quality(65)/cloudfront-us-east-1.images.arcpublishing.com/gmg/TGIVLLC3MBCLNBPNGQOWZB4UGQ.jpg")
                .setLikes(25));

        posts.add(new Post()
                .setAuthor("Keanu Reeves")
                .setContent("Come find me in Cyberpunk 2077")
                .setUserImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Reuni%C3%A3o_com_o_ator_norte-americano_Keanu_Reeves_%2846806576944%29_%28cropped%29.jpg/330px-Reuni%C3%A3o_com_o_ator_norte-americano_Keanu_Reeves_%2846806576944%29_%28cropped%29.jpg")
                .setImageUrl("https://www.sideshow.com/wp/wp-content/uploads/2019/12/Cyberpunk-Keanu.jpg")
                .setLikes(2077));

        posts.add(new Post()
                .setAuthor("Agent")
                .setContent("Opens on the 24th of December")
                .setUserImageUrl("https://images.squarespace-cdn.com/content/v1/54b9309be4b06e38ad5da1ca/1593621679911-W3QR5XE8V1JNHG7VW8RJ/ke17ZwdGBToddI8pDm48kFWxnDtCdRm2WA9rXcwtIYR7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UcTSrQkGwCGRqSxozz07hWZrYGYYH8sg4qn8Lpf9k1pYMHPsat2_S1jaQY3SwdyaXg/049e+-+Austrian+Airlines+started+long-haul+flights+1+%28C%29+Austrian+Airlines.jpg")
                .setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hubertushof-hinterglemm.at%2Fen%2Fhinterglemm%2Fski-holidays-salzburg.html&psig=AOvVaw3HI5JvVzQUvASbK5V4VzZp&ust=1608050238794000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNjCk430ze0CFQAAAAAdAAAAABAD")
                .setLikes(666));

        posts.add(new Post()
                .setAuthor("Cristiano Ronaldo")
                .setContent("I'm honored and proud to be among the finalists for the Globe Soccer Player of the Year and Player of the Century awards")
                .setUserImageUrl("https://pbs.twimg.com/profile_images/1157313327867092993/a09TxL_1_400x400.jpg")
                .setImageUrl("https://pbs.twimg.com/media/EpMHzgAXMAEjjcQ?format=jpg&name=900x900")
                .setLikes(5600));

        posts.add(new Post()
                .setAuthor("Benjamin Netanyahu")
                .setContent("My first meeting")
                .setUserImageUrl("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMSEhUSEhMWFRUVFxUVFRcYFxgVGBcVFRcWFhUXFxUYHSggGB0lHRUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGi0lHx0tLS0tLS0tLSstLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLSstLf/AABEIAPgAywMBIgACEQEDEQH/xAAcAAAABwEBAAAAAAAAAAAAAAAAAQIDBAUGBwj/xABCEAABAwEFBQYDBQYFBAMAAAABAAIDEQQFEiExBkFRYXETIjKBkaEHQrFywdHh8CNSgpKi8RQzQ2LCFlNzshU0Y//EABoBAAIDAQEAAAAAAAAAAAAAAAECAAMEBQb/xAAnEQACAgICAgEEAgMAAAAAAAAAAQIRAzESIQRBUQUTIkIyYRSBof/aAAwDAQACEQMRAD8A4vZNU9Icim7FqUp+hVctmiH8SIVMZ4FDU6OmBNIGPY2GqO/VS2hRZdUsWGejR3fN+yUS1aJy730jKjzOqEGyyiBD4/NXFvZ3QqWHxq5tvhaoxYEd2iqpdVav0Vc2Bz3HA1zvsgu+iMAZS0lnHZtFFGvB4IFFcC4pnMbRh8yGn0JSbTs3PTJoP8Q/FTsHVGXVpcjqOPRHJs7aR/pE9KH70/dl3yNLsbHN6gjj+CdlcNlfbdT1UJTrewgmvFQUIkmW10DuuUG0FTrs")
                .setImageUrl("https://cdn.cnn.com/cnnnext/dam/assets/191113135640-nentyahu-10272019-super-169.jpg")
                .setLikes(45000));

        posts.add(new Post()
                .setAuthor("fitnessQueen")
                .setContent("join our new program today")
                .setUserImageUrl("https://www.wellandgood.com/wp-content/uploads/2019/05/SIT-vs-HIIT-1.jpg")
                .setImageUrl("https://upl.stack.com/wp-content/uploads/2020/03/11113000/Morning-Workout.jpg")
                .setLikes(300));

        posts.add(new Post()
                .setAuthor("pokemon")
                .setContent("pokemon Battle")
                .setUserImageUrl("https://images1.calcalist.co.il/PicServer3/2016/07/11/620912/1-lm.jpg")
                .setImageUrl("https://wibow.co.il/wp-content/uploads/2020/09/%D7%9E%D7%A9%D7%97%D7%A7-%D7%A7%D7%95%D7%A4%D7%A1%D7%94-%D7%A7%D7%9C%D7%A4%D7%99-%D7%A4%D7%95%D7%A7%D7%99%D7%9E%D7%95%D7%9F-Pokemon-TCG-Battle-Academy-3.jpg")
                .setLikes(1000));

        posts.add(new Post()
                .setAuthor("pokemon22")
                .setContent("pokemon Battle22")
                .setUserImageUrl("https://images1.calcalist.co.il/PicServer3/2016/07/11/620912/1-lm.jpg")
                .setImageUrl("https://wibow.co.il/wp-content/uploads/2020/09/%D7%9E%D7%A9%D7%97%D7%A7-%D7%A7%D7%95%D7%A4%D7%A1%D7%94-%D7%A7%D7%9C%D7%A4%D7%99-%D7%A4%D7%95%D7%A7%D7%99%D7%9E%D7%95%D7%9F-Pokemon-TCG-Battle-Academy-3.jpg")
                .setLikes(2000));

        posts.add(new Post()
                .setAuthor("pokemon33")
                .setContent("pokemon Battle33")
                .setUserImageUrl("https://images1.calcalist.co.il/PicServer3/2016/07/11/620912/1-lm.jpg")
                .setImageUrl("https://wibow.co.il/wp-content/uploads/2020/09/%D7%9E%D7%A9%D7%97%D7%A7-%D7%A7%D7%95%D7%A4%D7%A1%D7%94-%D7%A7%D7%9C%D7%A4%D7%99-%D7%A4%D7%95%D7%A7%D7%99%D7%9E%D7%95%D7%9F-Pokemon-TCG-Battle-Academy-3.jpg")
                .setLikes(3000));

        posts.add(new Post()
                .setAuthor("foobar")
                .setContent("test")
                .setUserImageUrl("  https://www.google.com/url?sa=i&url=https%3A%2F%2Ftheconversation.com%2Fso-who-does-own-the-copyright-on-a-monkey-selfie-30334&psig=AOvVaw3EMpqRxX79m_AFO9eOVO7f&ust=1608050373088000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMjZ2Mz0ze0CFQAAAAAdAAAAABAD ")
                .setImageUrl("https://www.google.com/imgres?imgurl=https%3A%2F%2Fstatic.wikia.nocookie.net%2Frickandmorty%2Fimages%2Fa%2Fa6%2FRick_Sanchez.png%2Frevision%2Flatest%2Ftop-crop%2Fwidth%2F360%2Fheight%2F360%3Fcb%3D20160923150728&imgrefurl=https%3A%2F%2Frickandmorty.fandom.com%2Fwiki%2FRick_Sanchez&tbnid=E0GJDL6ZiQ-s2M&vet=12ahUKEwiaraTs9M3tAhWE34UKHTALAXcQMygGegUIARDhAQ..i&docid=UEW0p7UI1Q6F5M&w=360&h=360&q=rick&ved=2ahUKEwiaraTs9M3tAhWE34UKHTALAXcQMygGegUIARDhAQ")
                .setLikes(85));

        return posts;
    }
}
