package com.example.zhuwojia.recycleviewanimation.bean;

import java.util.List;

/**
 * Created by zhuwojia on 2016/11/24.
 */

public class Pictures {

    /**
     * msg : OK
     * data : [{"favorite":0,"subtitle":"","url":"http://www.menghuoapp.com/post/402","post_id":402,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg","title":"wuli萌货来啦！","published_at":1461586357,"favorite_num":23,"repost_num":972},{"favorite":0,"subtitle":"萌货app搬家公告","url":"http://www.menghuoapp.com/post/401","post_id":401,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160119/15a9f0709eae8405ad4608928c4e6e3e.png","title":"阿萌搬家啦~","published_at":1453219200,"favorite_num":51,"repost_num":2133},{"favorite":0,"subtitle":"猫咪主题杯子","url":"http://www.menghuoapp.com/post/396","post_id":396,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/ecc58fcfc24f3604a4d426574f129687.jpg","title":"喵星人杯具萌萌哒~","published_at":1453206600,"favorite_num":77,"repost_num":1078},{"favorite":0,"subtitle":"抹茶味零食","url":"http://www.menghuoapp.com/post/397","post_id":397,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/9c90de3b9d1c57bea227ea322ca1cd4d.jpg","title":"让抹茶系治愈躁动不安的你","published_at":1453120200,"favorite_num":79,"repost_num":816},{"favorite":0,"subtitle":"姆明亚美周边精选","url":"http://www.menghuoapp.com/post/399","post_id":399,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160112/02b80639d6f4f6b19fec5083266be7b9.jpg","title":"姆明一族万岁！","published_at":1453033800,"favorite_num":27,"repost_num":359},{"favorite":0,"subtitle":"太子妃升职记同款口红特辑","url":"http://www.menghuoapp.com/post/398","post_id":398,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160109/6304d63a0e6cdd7560396ce14ade4ce6.jpg","title":"跟着\u201c太子妃\u201d选口红！","published_at":1452947400,"favorite_num":32,"repost_num":285},{"favorite":0,"subtitle":"玻璃罐收纳特辑","url":"http://www.menghuoapp.com/post/400","post_id":400,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160114/c1f2babec34c52ebc909cf7c6163cf13.jpg","title":"把美好装满瓶瓶罐罐","published_at":1452861000,"favorite_num":74,"repost_num":346},{"favorite":0,"subtitle":"新年红转运特辑","url":"http://www.menghuoapp.com/post/395","post_id":395,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/d146f835a878e0bb22494a4be8b5ca16.jpg","title":"猴年开运大法","published_at":1452774600,"favorite_num":15,"repost_num":226},{"favorite":0,"subtitle":"唯美勺子特辑","url":"http://www.menghuoapp.com/post/394","post_id":394,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/0351490adf5a8935acccfd366b2b848b.jpg","title":"小公主的小勺子","published_at":1452688200,"favorite_num":57,"repost_num":294},{"favorite":0,"subtitle":"白菜价萌包推荐","url":"http://www.menghuoapp.com/post/393","post_id":393,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160106/487f39072400bf090c903eb6fdf79ff3.jpg","title":"没钱，也要买包包！","published_at":1452601800,"favorite_num":47,"repost_num":262}]
     * code : 0
     */

    private String msg;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * favorite : 0
         * subtitle :
         * url : http://www.menghuoapp.com/post/402
         * post_id : 402
         * pic_url : http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg
         * title : wuli萌货来啦！
         * published_at : 1461586357
         * favorite_num : 23
         * repost_num : 972
         */

        private int favorite;
        private String subtitle;
        private String url;
        private int post_id;
        private String pic_url;
        private String title;
        private int published_at;
        private int favorite_num;
        private int repost_num;

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getPost_id() {
            return post_id;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public int getFavorite_num() {
            return favorite_num;
        }

        public void setFavorite_num(int favorite_num) {
            this.favorite_num = favorite_num;
        }

        public int getRepost_num() {
            return repost_num;
        }

        public void setRepost_num(int repost_num) {
            this.repost_num = repost_num;
        }
    }
}
