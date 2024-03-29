package com.readingradar.android.adapters
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.RecyclerView
//import com.readingradar.android.data.models.Book
//import com.readingradar.android.databinding.BooksViewHolderBinding
//import com.readingradar.android.utils.BooksClickListener
//
//class BestSellersBooksAdapter(
//    private val books: List<Book>,
//    private val parentFragment: Fragment,
//    private val clickListener: BooksClickListener
//) :
//    RecyclerView.Adapter<BestSellersBooksAdapter.ViewHolder>() {
//
//    class ViewHolder(binding: BooksViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {
//        val bookCard = binding.booksCardView
//        val imageCover = binding.bookImageView
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(
//            BooksViewHolderBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val book = books[position]
//
//        // Add the click listener
//        holder.bookCard.setOnClickListener {
//            clickListener.onClick(book)
//        }
//
////        Glide.with(parentFragment)
////            .load(book.bookImage)
////            .placeholder(R.drawable.placeholder)
////            .override(book.imageWidth, book.imageHeight)
////            .into(holder.imageCover)
//    }
//
//    override fun getItemCount() = books.size
//
//}
